package metier;

import java.util.HashMap;
import java.util.List;

public class Classement
{
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

    public void Classement(List<Integer> Class1, List<Integer> Class2, List<Integer> Class3, List<Integer> Class4, List<Integer> Class5,
        List<Integer> Class6, List<Integer> Class7, List<Integer> Class8, List<Integer> Class9)
    {
        // On met les listes reçues dans la map
        MapClassement.put(1, Class1);
        MapClassement.put(2, Class2);
        MapClassement.put(3, Class3);
        MapClassement.put(4, Class4);
        MapClassement.put(5, Class5);
        MapClassement.put(6, Class6);
        MapClassement.put(7, Class7);
        MapClassement.put(8, Class8);
        MapClassement.put(9, Class9);

    }

}
