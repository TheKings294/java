package Method;

public class Addition {
    public Addition(int a, int b) {
        System.out.println("Resultat Addition : " + calculerSomme(a , b));
    }

    private int calculerSomme(int a, int b) {
        return a + b;
    }
}
