package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.transaction.InvalidTransactionException;
import javax.transaction.TransactionRolledbackException;

import org.apache.log4j.Logger;

public class Transaction implements AutoCloseable
{

    public enum Etat
    {
        INIT, DEMARREE, CORROMPUE, ANNULEE, VALIDEE, EN_COURS_ANNULATION, EN_COURS_VALIDATION, EN_COURS_DEMARRAGE, TERMINEE;
    }

    private static final Logger LOG = Logger.getLogger(Transaction.class);

    private String info;

    private Connection connexion;

    private Etat etat = Etat.INIT;

    private boolean rollbackDemande = false;

    public Transaction(String info)
    {
        super();
        this.info = info;
    }

    public Transaction()
    {
        super();
    }

    public void begin() throws SQLException, InvalidTransactionException, NamingException
    {
        try
        {
            if ((getEtat() != Etat.INIT) ||
                (connexion != null && !connexion.isClosed()))
            {
                setEtat(Etat.CORROMPUE);
                throw new InvalidTransactionException(this.toString());
            }
            setEtat(Etat.EN_COURS_DEMARRAGE);
            this.connexion = CxoPool.getConnection();
            this.connexion.setAutoCommit(false);
            setEtat(Etat.DEMARREE);
        }
        catch (SQLException e)
        {
            setEtat(Etat.CORROMPUE);
            LOG.error(this.info, e);
            throw e;
        }
        catch (IOException e)
        {
            setEtat(Etat.CORROMPUE);
            LOG.error(this.toString() + " : Impossible d'obtenir une connexion", e);
            throw new InvalidTransactionException(this.toString());
        }

    }

    public void signalerRollback() throws InvalidTransactionException
    {
        if (!this.rollbackDemande)
        {
            if (getEtat() != Etat.DEMARREE)
                throw new InvalidTransactionException(this.toString());
            this.rollbackDemande = true;
            LOG.debug(this.toString() + " : demande de rollbak enregistrée");
        }
    }

    @Override
    public void close() throws InvalidTransactionException
    {
        if (this.connexion != null)
        {
            try
            {
                if (this.connexion.isClosed())
                {
                    setEtat(Etat.CORROMPUE);
                    LOG.error(this.toString() + " : Impossible de terminer une transaction sur une connexion fermée");
                    throw new InvalidTransactionException(this.info);
                }
                else
                {
                    if (this.rollbackDemande)
                    {
                        setEtat(Etat.EN_COURS_ANNULATION);
                        LOG.debug(this.toString() + " : rollback");
                        this.connexion.rollback();
                        setEtat(Etat.ANNULEE);
                    }
                    else
                    {
                        setEtat(Etat.EN_COURS_VALIDATION);
                        LOG.debug(this.toString() + " : commit");
                        this.connexion.commit();
                        setEtat(Etat.VALIDEE);
                    }
                }
            }
            catch (SQLException e)
            {
                setEtat(Etat.CORROMPUE);
                LOG.error(this.toString(), e);
                throw new InvalidTransactionException(this.info);
            }
            finally
            {
                try
                {
                    if (this.connexion != null && !this.connexion.isClosed())
                    {
                        LOG.debug(this.toString() + " : fermeture et remise de la connexion");
                        this.connexion.close();
                    }
                }
                catch (SQLException e)
                {
                    setEtat(Etat.CORROMPUE);
                    LOG.error(this.toString(), e);
                    throw new InvalidTransactionException(this.info);
                }
            }

        }
    }

    final Connection getConnexion() throws TransactionRolledbackException
    {
        if (rollbackDemande)
        {
            LOG.debug(this.toString() + " : pas de retour de connection après une demande de rollback");
            throw new TransactionRolledbackException(this.info);
        }
        return connexion;
    }

    public final boolean isRollbackDemande()
    {
        return rollbackDemande;
    }

    public final Etat getEtat()
    {
        return etat;
    }

    protected final void setEtat(Etat etat)
    {
        LOG.debug(this.info + " : changement etat [" + this.etat + "->" + etat + "]");
        this.etat = etat;
    }

    @Override
    public String toString()
    {
        return "Transaction [info=" + info + ", etat=" + etat + ", rollbackDemande=" + rollbackDemande + "]";
    }

}
