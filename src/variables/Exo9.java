package variables;
import java.util.Random;

public class Exo9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(43) + 1;
        boolean num42 = number == 42;

        System.out.println(num42);
    }
}
