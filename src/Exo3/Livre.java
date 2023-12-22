package Exo3;

public class Livre {
    private String titre,auteur;
    private int prix,annee;
    public Livre(){}
    public Livre(String t){
        this.titre=t;
    }
    public Livre(String t,String a){
        this.titre=t;
        this.auteur=a;
    }
    public Livre(String t,String a,int p){
        this.titre=t;
        this.auteur=a;
        this.prix=p;
    }

    public Livre(String t, String a, int p,int an){
        this.titre=t;
        this.auteur=a;
        this.prix=p;
        this.annee=an;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getPrix() {
        return prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String toString(){
        return "titre "+this.titre+" auteur "+this.auteur+" prix "+this.prix+" annee "+this.annee;
    }
}
