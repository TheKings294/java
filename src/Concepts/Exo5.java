package Concepts;

public class Exo5 {
    public static void main(String[] args) {
        AvionDeTransport avionDeTransport = new AvionDeTransport();
        AvionDeChasse avionDeChasse = new AvionDeChasse();
        PorteAvion porteAvion = new PorteAvion();

        avionDeTransport.decoller();
        avionDeChasse.decoller();

        System.out.println("============Porte Avions==========");

        porteAvion.addAvion(new AvionDeChasse());
        porteAvion.addAvion(new AvionDeTransport());
        porteAvion.decollerAvion(1);
        porteAvion.decollerAvion(0);
    }
}