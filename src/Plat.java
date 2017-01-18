/**
 * Created by association on 18/01/17.
 */
public class Plat {
    String nom;
    String description;
    boolean vegetarien;
    double prix;

    public Plat(String nom, String description, boolean vegetarien, double prix) {
        this.nom = nom;
        this.description = description;
        this.vegetarien = vegetarien;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarien() {
        return vegetarien;
    }

    public double getPrix() {
        return prix;
    }

    public boolean estVegetarien() {
        return vegetarien;
    }

    @Override
    public String toString() {
        return "Plat{" +
                "nom='" + getNom() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", prix=" + getPrix() +
                '}';
    }
}
