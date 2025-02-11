package Atribut;

public class Compte {
    static int nombreDeComptes = 0;
    private String nom;

    public Compte(String nom) {
        this.nom = nom;
        nombreDeComptes++;
    }
    public String getNom() {
        return nom;
    }
}
