package Concepts;

public class Cercle extends Forme {
    private double r;

    public Cercle(double r) {
        this.r = r;
    }

    @Override
    public void calculerSurface() {
        double cal = Math.PI * Math.pow(this.r, 2);
        System.out.println(cal);
    }
}
