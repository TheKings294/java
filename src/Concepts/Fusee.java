package Concepts;

public class Fusee {
    protected String name;
    protected int weight;

    public Fusee(String name, int weight) {
        this.name = name;
        this.weight = weight;
        System.out.println("Fusee " + name + " with weight " + weight + "Kg");
    }
    protected void lancer() {
        System.out.println("La fusée " + name + " est en phase de lancement.");
    }
}
