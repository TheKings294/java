package Concepts;

public class Exo3 {
    public static void main(String[] args) {
        Employe direction = new Directeur();
        Employe employer = new Employe();
        Employe prof = new Enseignant();
        direction.traviller();
        employer.traviller();
        prof.traviller();
    }
}
