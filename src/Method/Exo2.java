package Method;

public class Exo2 {
    public static void main(String[] args) {
        Persons antoine = new Persons("Antoine", 18, "24 rue de l'exo");
        MaClass test = new MaClass();
        System.out.println(antoine.getName());
        System.out.println(antoine.afficherAddress());
    }
}
