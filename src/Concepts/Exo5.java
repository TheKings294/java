package Concepts;

public class Exo5 {
    public static void main(String[] args) {
        Avion avion = new Avion();
        AvionDeTransport avionDeTransport = new AvionDeTransport();
        AvionDeChasse avionDeChasse = new AvionDeChasse();
        PorteAvion porteAvion = new PorteAvion();

        avion.decoller();
        avionDeTransport.decoller();
        avionDeChasse.decoller();

        porteAvion.addAvion(new AvionDeChasse());
        porteAvion.addAvion(new AvionDeTransport());
        porteAvion.decollerAvion(1);
    }
}