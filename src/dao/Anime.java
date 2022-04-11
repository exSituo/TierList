package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import metier.Classement;
import metier.User;

public class Anime
{
    private static Anime instance = new Anime();
    
    protected Anime()
    {
        
    }
    
    public static final Anime getInstance() 
    {
        return instance;    
    }
    
    /*
     * Transaction : permet l'affichage des données
     * renvoie les données du classement de user à partir de la base de données  
     * accès via idUser
     * Key --> idUser Value --> score classement
     */
   
    public Map<Integer, Classement>  initClassementUser (Transaction transaction)
    {
        Map<Integer, Classement> resultat = new HashMap<>();

        try
        {
            Connection c = transaction.getConnexion();
            String requete = "insert  from "; 

           
        }
        catch (Exception e)
        {
            Logger.getLogger(Anime.class).error(e.getMessage());
        }
        
        return null;
        
    }
    
    /*
     * Transaction : chargement  du classement de user dans la base de données  
     * Key --> idUser Value --> score classement
     */
   
    public Map<Integer, Classement> affClassementUser (Transaction transaction, User idUser)
    {
        Map<Integer, Classement> resultat = new HashMap<>();

        try
        {
            Connection c = transaction.getConnexion();
            String requete = "select  from "; // à modifier !
            try (PreparedStatement st = c.prepareStatement(requete);
                ResultSet rst = st.executeQuery())
            {
                while (rst.next())
                {
                    //Ce qui est renvoyé ! 
                }
            }
            
   
        }
        catch (Exception e)
        {
            Logger.getLogger(Anime.class).error(e.getMessage());
        }
        
        return null;
        
    }
    
    
}
