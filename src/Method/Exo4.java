package Method;

public class Exo4 {
    public static void main(String[] args) {
        Compteur compteur = new Compteur();
        compteur.incrementer(10);
        System.out.println(Compteur.afficherCompteur(compteur));
        compteur.incrementer(20);
        System.out.println(Compteur.afficherCompteur(compteur));
    }
}
