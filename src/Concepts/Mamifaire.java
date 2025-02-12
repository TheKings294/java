package Concepts;

public class Mamifaire extends Animal {
    public Mamifaire(String name) {
        this.name = name;
    }
    @Override
    public void moove() {
        this.marcher();
    }
    private void marcher() {
        System.out.println("Je marche !");
    }
}
