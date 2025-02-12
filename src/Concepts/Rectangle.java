package Concepts;

public class Rectangle extends Forme {
    private double x;
    private double y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void calculerSurface() {
        double cal = this.x * this.y;
        System.out.println(cal);
    }
}