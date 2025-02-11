package Atribut;

public class Exo2 {
    public static void main(String[] args) {
        MaClass maClass = new MaClass();

        System.out.println(maClass.nom);
        maClass.nom = "deuxième test";
        System.out.println(maClass.nom);
    }
    static class MaClass {
        public String nom = "test";
    }
}
