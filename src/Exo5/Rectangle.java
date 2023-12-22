package Exo5;


public class Rectangle {
    private float longeur,largeur;
    public Rectangle(){}
    public Rectangle(float lon,float larg){
        this.longeur=lon;
        this.largeur=larg;
    }
    public Rectangle(Rectangle rectangle){
        this.longeur=Rectangle.getlongeur();
        this.largeur=Rectangle.getlargeur();
    }

    private static float getlargeur() {
        return 0;
    }

    private static float getlongeur() {
        return 0;
    }


    public float getLongeur() {
        return longeur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLongeur(float longeur) {
        this.longeur = longeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }
    public float perimetre(){
        return 2*(this.longeur +this.largeur);
    }
    public float aire(){
        return (this.longeur * this.largeur);
    }
    public boolean isCarre(){
        if(this.longeur == this.largeur)
            return true;
        else return false;
    }
    public String toString(){
        return "longeur= "+this.longeur+" largeur= "+this.largeur;
    }
}

