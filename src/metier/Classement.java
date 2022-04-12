package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Classement
{
<<<<<<< HEAD
    // Pas besoin de déclarer les listes, car on les récupère depuis le formulaire
    // ArrayList<Integer> Class1 = new ArrayList<Integer>();
    //
    // ArrayList<Integer> Class2 = new ArrayList<Integer>();
    //
    // ArrayList<Integer> Class3 = new ArrayList<Integer>();
    //
    // ArrayList<Integer> Class4 = new ArrayList<Integer>();
    //
    // ArrayList<Integer> Class5 = new ArrayList<Integer>();
    //
    // ArrayList<Integer> Class6 = new ArrayList<Integer>();
    //
    // ArrayList<Integer> Class7 = new ArrayList<Integer>();
    //
    // ArrayList<Integer> Class8 = new ArrayList<Integer>();
    //
    // ArrayList<Integer> Class9 = new ArrayList<Integer>();

    HashMap<Integer, List<Integer>> MapClassement = new HashMap<Integer, List<Integer>>();

    public void Classement(List<Integer> class1, List<Integer> class2, List<Integer> class3, List<Integer> class4, List<Integer> class5,
        List<Integer> class6, List<Integer> class7, List<Integer> class8, List<Integer> class9)
=======
     
    HashMap<Integer, List<String>> mapClassement = new HashMap<>();
    private Integer idTier;;
    private Integer niveau;
    private Anime anime;
    private User user;
    
    public Map<Integer, List<String>> ajoutClassement()
>>>>>>> 447decec93bb615c7da3ef758bf28c596cb9315d
    {
       
        // On met les listes reçues dans la map
<<<<<<< HEAD
        MapClassement.put(1, class1);
        MapClassement.put(2, class2);
        MapClassement.put(3, class3);
        MapClassement.put(4, class4);
        MapClassement.put(5, class5);
        MapClassement.put(6, class6);
        MapClassement.put(7, class7);
        MapClassement.put(8, class8);
        MapClassement.put(9, class9);

=======
        List<String> temp = new ArrayList<>();
        
        //on récupére les attributs de chaque objet 
        // dans une liste que l'on écaltera par la suite
        StringBuilder str = new StringBuilder();
        str.append(niveau).append(anime.getIdAnime()).append(user.getIdUser());
        temp.add(str.toString());
            return (Map<Integer, List<String>>) mapClassement.put(idTier,temp);
   
>>>>>>> 447decec93bb615c7da3ef758bf28c596cb9315d
    }
    
    

}
