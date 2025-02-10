package variables;
import java.lang.String;

public class Exo8 {
    public static void main(String[] args) {
        String myString = "quarante-deux";

        char[] myArray42 = myString.toCharArray();
        String concac = "La grande réponse sur la vie, l’univers et le reste ! " + String.valueOf(myArray42);
        System.out.println(concac);
    }
}
