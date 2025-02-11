package Method;

public class Compteur {
    private int compter = 0;

    public void incrementer(int valeur) {
        this.compter += valeur;
    }

    public static int afficherCompteur(Compteur c) {
       return c.compter;
    }
}
