package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classement
{

    HashMap<Integer, List<String>> mapClassement = new HashMap<>();

    private Integer idTier;;

    private Integer niveau;

    private Anime anime;

    private User user;

    public Map<Integer, List<String>> ajoutClassement()
    {

        // On met les listes reçues dans la map
        List<String> temp = new ArrayList<>();

        // on récupére les attributs de chaque objet
        // dans une liste que l'on écaltera par la suite
        StringBuilder str = new StringBuilder();
        str.append(niveau).append(anime.getIdAnime()).append(user.getIdUser());
        temp.add(str.toString());
        return (Map<Integer, List<String>>) mapClassement.put(idTier, temp);

    }

}
