package Concepts;

public class Ariane6Lancement {
    public Ariane6Lancement(Ariane6 a) {
        System.out.println("Je lance la fuse " + a.name);
        a.lancer();
    }
}