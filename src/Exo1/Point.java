package Exo1;

public class Point {
    char nom;
    double abscisse;
    public Point(char n,double a){
        this.nom=n;
        this.abscisse=a;
    }
    public void afficher(){
        System.out.println("le point: "+this.nom+" abscisse: "+this.abscisse);
    }
    public void translate(double dx){
        this.abscisse+=dx;
    }
}

