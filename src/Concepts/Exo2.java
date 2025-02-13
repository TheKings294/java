package Concepts;

public class Exo2 {
    public static void main(String[] args) {
        Voiture peugot = new Voiture("406", "bleu", -100);
        Voiture ferrari = new Voiture("F80", "rouge", 100000);
        peugot.setPrix(200);
        System.out.println("Model : " + ferrari.getModele());
        System.out.println("========================");
        peugot.afficherDetails();
        System.out.println("========================");
        ferrari.afficherDetails();
    }
}
