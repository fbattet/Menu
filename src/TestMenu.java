/**
 * Created by association on 18/01/17.
 */
public class TestMenu {
    public static void main(String[] args) {
        MenuCreperie menuCreperie = new MenuCreperie();
        MenuCafete menuCafete = new MenuCafete();

        Serveuse serveuse = new Serveuse(menuCreperie, menuCafete);
        serveuse.afficherMenu();
    }
}
