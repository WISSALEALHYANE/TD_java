package Exo4;

public class Temps {
    private int heures,minutes,secondes;
    public Temps(){ }
    public Temps(int h){
        this.heures=h;
    }
    public Temps(int h,int m){
        this.heures=h;
        this.minutes=m;
    }
    public Temps(int h,int m,int s){
        this.heures=h;
        this.minutes=m;
        this.secondes=s;
    }
    public void ajouterHreures(int h){
        this.heures=h;
        if(h>23){
            this.heures%=24;
        }}
    public void ajouterMinutes(int m){
        this.minutes=m;
        if(m>59){
            ajouterHreures(minutes/60);
            this.minutes%=60;
        }}
    public void ajouterSecondes(int s){
        this.secondes=s;
        if(s>59){ajouterMinutes(secondes/60);
            this.secondes%=60;}}
    public int getHeures(){
        return heures;}

    public int getMinutes() {
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }
    public String toString(){
        return "heures "+this.heures+" minutes "+this.minutes+" secondes "+this.secondes;
    }
}
