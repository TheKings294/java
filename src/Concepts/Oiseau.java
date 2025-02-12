package Concepts;

public class Oiseau extends Animal {
    public Oiseau(String name) {
        this.name = name;
    }
    @Override
    public void moove() {
        this.voler();
    }
    private void voler() {
        System.out.println("Je vole !");
    }
}
