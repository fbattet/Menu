import java.util.Iterator;

/**
 * Created by association on 18/01/17.
 */
public class MenuCafete implements Menu {
    static final int MAX_PLATS = 6;
    int nombreDePlats = 0;
    Plat[] plats;

    public MenuCafete() {
        plats = new Plat[MAX_PLATS];

        ajouterPlat("Salade printanière",
                "Salade verte, tomates, concombre, olives, pommes de terre", true, 2.99);
        ajouterPlat("Salade parisienne",
                "Salade verte, tomates, poulet, emmental", false, 2.99);
        ajouterPlat("Soupe du jour",
                "Soupe du jour et croûtons grillés", false, 3.29);
        ajouterPlat("Quiche aux fruits de mer",
                "Pâte brisée, crevettes, moules, champignons",
                false, 3.05);
// ajouter ici d’autres elements
    }

    public void ajouterPlat(String nom, String description, boolean vegetarien, double prix) {
        Plat plat = new Plat(nom, description, vegetarien, prix);

        if (nombreDePlats >= MAX_PLATS) {
            System.err.println("Désolé, le menu est plein ! Impossiple d'ajouter un plat");
        } else {
            plats[nombreDePlats] = plat;
            nombreDePlats++;
        }
    }

//    public Plat[] getPlats() {
//        return elements;
//    }

    @Override
    public Iterator creerIterateur() {
        return new IterateurMenuCafetaria(plats);
    }
}
