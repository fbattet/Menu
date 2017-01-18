import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by association on 18/01/17.
 */
public class MenuCreperie implements Menu {
    ArrayList plats;

    public MenuCreperie() {
        this.plats = new ArrayList();

        ajouterPlat("Crêpe à l’oeuf",
                "Crêpe avec oeuf au plat ou brouillé",
                true,
                2.99);
        ajouterPlat("Crêpe complète",
                "Crêpe avec oeuf au plat et jambon",
                false,
                2.99);
        ajouterPlat("Crêpe forestière",
                "Myrtilles fraîches et sirop de myrtilles",
                true,
                3.49);
        ajouterPlat("Crêpe du chef",
                "Crème fraîche et fruits rouges au choix",
                true,
                3.59);
    }

    public void ajouterPlat(String nom, String description, boolean vegetarien, double prix) {
        Plat plat = new Plat(nom, description, vegetarien, prix);
        plats.add(plat);
    }

//    public ArrayList getPlats() {
//        return elements;
//    }

    @Override
    public Iterator creerIterateur() {
        return plats.iterator();
    }
}
