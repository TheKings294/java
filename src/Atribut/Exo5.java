package Atribut;

public class Exo5 {
    public static void main(String[] args) {
        Voiture peugot = new Voiture("Peugot");

        System.out.println(peugot.getBrand());
    }
    static class Voiture {
        private String brand;

        public Voiture(String brand) {
            this.brand = brand;
        }
        public String getBrand() {
            return brand;
        }
    }
}
