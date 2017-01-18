import java.util.Iterator;

/**
 * Created by association on 18/01/17.
 */
public class Serveuse {
    Menu menuCreperie;
    Menu menuCafete;

    public Serveuse(Menu menuCreperie, Menu menuCafete) {
        this.menuCreperie = menuCreperie;
        this.menuCafete = menuCafete;
    }

    public void afficherMenu() {
        Iterator iterateurMenuCreperie = menuCreperie.creerIterateur();
        Iterator iterateurMenuCafete = menuCafete.creerIterateur();

//        Iterator iterator = platsBrunch.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        for (int i = 0; i < platsBrunch.size(); i++) {
//            System.out.println((Plat) platsBrunch.get(i));
//        }
//
//        for (int i = 0; i < platsDejeuner.length; i++) {
//            System.out.println(platsDejeuner[i]);
//        }

//        while (iterateurMenuCafete.encore()) {
//            System.out.println((Plat)iterateurMenuCafete.suivant());
//        }
//
//        while (iterateurMenuCreperie.encore()) {
//            System.out.println((Plat)iterateurMenuCreperie.suivant());
//        }

        System.out.println("MENU\n-----\nBRUNCH");
        afficherMenu(iterateurMenuCreperie);
        System.out.println("\nDÉJEUNER");
        afficherMenu(iterateurMenuCafete);
    }

    private void afficherMenu(Iterator iterateur) {
        while (iterateur.hasNext()) {
            System.out.println((Plat)iterateur.next());
        }
    }
}
