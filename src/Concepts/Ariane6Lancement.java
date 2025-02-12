package Concepts;

public class Ariane6Lancement {
    public Ariane6Lancement(String name, int weight) {
        Ariane6 arianne = new Ariane6(name, weight);
        arianne.lancer();
    }
}
