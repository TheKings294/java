package Concepts;

import java.util.ArrayList;
import java.util.List;

public class PorteAvion {
    private List<Avion> avions;

    public PorteAvion() {
        this.avions = new ArrayList<>();
    }
    public void addAvion(Avion avion) {
        avions.add(avion);
    }
    public void decollerAvion(int n) {
       avions.get(n).decoller();
    }
}
