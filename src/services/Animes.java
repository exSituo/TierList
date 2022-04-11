package services;

import java.util.Map;

import org.apache.log4j.Logger;

import dao.Transaction;

public class Animes
{
    private static Animes instance = new Animes();
    // collection d'animé (key --> id de l'animé value --> titre)
    private Map<Integer, String> collAnimes;

    
    protected Animes()
    {
        
    }
    
    public static final Animes getInstance() 
    {
        return instance;    
    }
    
    private void init()
    {
        if (collAnimes == null)
        {
//            // A partir de javaEE tout accès aux données doit passer par une transaction
            try (Transaction transaction = new Transaction("Transaction d'initialisation des clients")) 
            {
//            {
//                // Démarrage de la transaction
//                transaction.begin();
//                collClients = DaoClient.getInstance().initClients(transaction);
            }
            catch (Exception e)
            {
                Logger.getLogger(Animes.class).error(e);
            }
        }
    }
    
}
