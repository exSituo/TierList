package dao;

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
     * Transaction : chargement de l'animé ?
     */
    
}
