package lab8.clonable;

public class Carte implements Cloneable{
    String nume;

    public Carte clone() throws CloneNotSupportedException {
        Carte c = (Carte)super.clone(); // atat clona de suprafata cat si clona de profunzime - nu avem variabile instanta mutabile
        return c;
    }

    public Carte(String nume) {
        this.nume = nume;
    }
}
