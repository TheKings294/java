package Concepts;

public class Voiture {
    private String modele;
    private String couleur;
    private int prix;

    public Voiture(String modele, String couleur, int prix) {
        this.modele = modele;
        this.couleur = couleur;
        this.prix = Math.max(prix, 0);
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = Math.max(prix, 0);
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public void afficherDetails() {
        System.out.println("Modele : " + modele);
        System.out.println("Couleur : " + couleur);
        System.out.println("Prix : " + prix);
    }
}
