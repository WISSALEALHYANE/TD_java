package Exo2;

public class Point {
    private char nom;
    private double abscisse,ordonne;
    public Point(char n,double a,double o){
        this.nom=n;
        this.abscisse=a;
        this.ordonne=o;
    }
    public char getNom(){
        return nom;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public double getOrdonne() {
        return ordonne;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonne(double ordonne) {
        this.ordonne = ordonne;
    }
    public double norme(){
        return Math.sqrt(Math.pow(this.abscisse,2)+Math.pow(this.ordonne,2));
    }
}