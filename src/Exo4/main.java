package Exo4;
public class main {
    public static void main(String[] args){
        Temps t=new Temps(2,5,6);
        System.out.println(t.toString());
        t.ajouterMinutes(120);
        System.out.println(t);
        t.ajouterSecondes(300);
        System.out.println(t);

    }
}

