package variables;

public class Exo10 {
    public static void main(String[] args) {
        System.out.println(typeOf(42.3));
    }

    public static String typeOf(Object o) {
        return o.getClass().getSimpleName();
    }
}
