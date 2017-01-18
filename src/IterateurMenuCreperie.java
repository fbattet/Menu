import java.util.ArrayList;

/**
 * Created by association on 18/01/17.
 */
public class IterateurMenuCreperie implements Iterateur {
    ArrayList elements;
    int position = 0;

    public IterateurMenuCreperie(ArrayList elements) {
        this.elements = elements;
    }

    @Override
    public boolean encore() {
        return position < elements.size();
    }

    @Override
    public Object suivant() {
        Object plat =  elements.get(position);
        position++;
        return plat;
    }
}
