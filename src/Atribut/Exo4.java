package Atribut;

public class Exo4 {
    public static void main(String[] args) {
        System.out.println(Compte.nombreDeComptes);

        Compte compte = new Compte("123");
        System.out.println(Compte.nombreDeComptes);
        Compte compte2 = new Compte("456");
        System.out.println(Compte.nombreDeComptes);
        Compte compte3 = new Compte("789");
        System.out.println(Compte.nombreDeComptes);
    }
    static class Compte {
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
}
