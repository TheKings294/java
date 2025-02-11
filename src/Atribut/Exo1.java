package Atribut;

public class Exo1 {
    public static void main(String[] args) {
        Livre HarryPotter = new Livre("HarryPotter");

        System.out.println(HarryPotter.getName());
        HarryPotter.setName("HarryPotter A L ecole Des Sorciers");
        System.out.println(HarryPotter.getName());
    }
}