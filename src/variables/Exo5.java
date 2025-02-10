import java.util.Objects;
public class Exo5 {
    public static void main(String[] args) {
        String age = null;
        String age2 = Objects.requireNonNullElse(age, "42");
        System.out.println(age2);
    }
}
