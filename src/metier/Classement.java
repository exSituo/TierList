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

    public void Classement(List<Integer> class1, List<Integer> class2, List<Integer> class3, List<Integer> class4, List<Integer> class5,
        List<Integer> class6, List<Integer> class7, List<Integer> class8, List<Integer> class9)
    {
        // On met les listes reçues dans la map
        MapClassement.put(1, class1);
        MapClassement.put(2, class2);
        MapClassement.put(3, class3);
        MapClassement.put(4, class4);
        MapClassement.put(5, class5);
        MapClassement.put(6, class6);
        MapClassement.put(7, class7);
        MapClassement.put(8, class8);
        MapClassement.put(9, class9);

    }

}
