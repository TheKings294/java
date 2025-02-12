package Concepts;

public class Exo1 {
    public static void main(String[] args) {
        Mamifaire mamifaire = new Mamifaire("Martin");
        Oiseau oiseau = new Oiseau("Matin");
        System.out.println("Manifère: " + mamifaire.name);
        mamifaire.moove();
        System.out.println("Oiseau: " + oiseau.name);
        oiseau.moove();
    }
}