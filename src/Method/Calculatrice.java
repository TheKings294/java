package Method;
import java.util.regex.*;
import java.util.Optional;

public class Calculatrice {
    private int add(int a, int b) {
        return a + b;
    }
    private double add(double a, double b) {
        return a + b;
    }
    private int sub(int a, int b) {
        return a - b;
    }
    private double sub(double a, double b) {
        return a - b;
    }
    private int mul(int a, int b) {
        return a * b;
    }
    private double mul(double a, double b) {
        return a * b;
    }
    private int div(int a, int b) {
        return a / b;
    }
    private double div(double a, double b) {
        return a / b;
    }
    public double effectuerOperation(String operation, double a, double b) {
        double result = 0;
        switch (operation) {
            case "add":
                result =  add(a, b);
                break;
            case "sub":
                result = sub(a, b);
                break;
            case "mul":
                result = mul(a, b);
                break;
            case "div":
                result = div(a, b);
                break;
        }
        String str = String.valueOf(result);
        Pattern pattern = Pattern.compile("^42(?:\\.0)?$");

        Optional.of(pattern.matcher(str).find())
                .filter(Boolean::booleanValue)
                .ifPresent(match -> System.out.println("T\'sérieux pas 42 on avait dit"));

        return result;
    }
}
