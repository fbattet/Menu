import java.util.Iterator;

/**
 * Created by association on 18/01/17.
 */
public class IterateurMenuCafetaria implements Iterator {
    Plat[] elements;
    int position = 0;

    public IterateurMenuCafetaria(Plat[] elements) {
        this.elements = elements;
    }

//    @Override
//    public boolean encore() {
//        if (position >= elements.length || elements[position] == null) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    @Override
//    public Object suivant() {
//        Plat plat = elements[position];
//        position++;
//        return plat;
//    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Vous ne pouvez pas supprimer un éléments si vous n'avez pas fait au mooins un next()");
        }
        if (elements[position] != null) {
            for (int i = position - 1; i < (elements.length - 1); i++) {
                elements[i] = elements[i + 1];
                elements[elements.length - 1] = null;
            }
        }
    }
}
