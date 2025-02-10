package variables;

public class Exo13 {
    public static void main(String[] args) {
        int a = 12;
        int b = 42;
        System.out.printf("a = %d, b = %d\n", a, b);
        int c = a;
        a = b;
        b = c;
        System.out.printf("a = %d, b = %d\n", a, b);
    }
}
