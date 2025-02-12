package Concepts;

public class Ariane6 extends Fusee {
    public Ariane6(String name, int weight) {
        super(name, weight);
    }

    protected void lancer() {
        super.lancer();
        System.out.println("La fusée "  + name  +" commence son lancement avec une poussée spécifique.");
        System.out.println("Les étages de la fusée " + name + " se séparent après le lancement.");
    }
}
