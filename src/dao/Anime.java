package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
            
            
            String requete = "insert"; 
           
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
   
    public void affClassementUser (Transaction transaction, User idUser, Classement classement)
    {
        Map<Integer, Classement> resultat = new HashMap<>();
        int[] resultatInsertClassement = new int[0];
        try
        {
            
            
            Connection c = transaction.getConnexion();
            try (PreparedStatement st = c.prepareStatement("INSERT INTO tiers (id_tier, niveau, id_user, id_anime) VALUES )"
                + " VALUES (id_tier,?,?,?)");
                ResultSet rst = st.executeQuery())
            {
                while (rst.next())
                {
                    List<String> ligneInsert = getDictionnaireClassement(classement); //collection de lignes
                    
                    for (String str : ligneInsert)
                    {
                        String[] attributs = str.split(",");
                            Integer nivClas = Integer.valueOf(attributs[0]);
                            String idClient = attributs[1];
                            Integer idAnime = Integer.valueOf(attributs[2]); 
                            
                            st.setString(nivClas,idClient);

                    }
                    
                    int[] resultatInsertAdresse = st.executeBatch();
                    
                
                }
            }
            
   
        }
        catch (Exception e)
        {
            Logger.getLogger(Anime.class).error(e.getMessage());
        }
                
    }
    
    public List<String> getDictionnaireClassement (Classement classement){
        List<String> collectionInsert = null; //liste des lignes à insérer
        
        // on retourne les éléments issues de la page web à partir de la méthode ajout classement
        Map<Integer, List<String>> tempMap = classement.ajoutClassement();
        
        /*
         * Boucle du dictionnaire 
         */
        for (Entry<Integer, List<String>> entry : tempMap.entrySet()) {
           
            for (String element : collectionInsert) //ajouter à ma collection de ligne les insertions
            {
                String nivClas = entry.getValue().get(0);  // 1er élément de la liste
                String idClient = entry.getValue().get(1); // 2ème élément de la liste
                String idAnime = entry.getValue().get(2); //3ème élément de la liste
           
                StringBuilder str = new StringBuilder();             
                str.append(nivClas).append(",").append(idClient).append(",").append(idAnime)
                .append(";");  
                element = str.toString(); // chargement dans le tableau des lignes
            }
        
        }
        return collectionInsert; // retourne les lignes
        
       
    }
    
}
