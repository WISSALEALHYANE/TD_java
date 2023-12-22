package Exo6;
public class Banque {
    private int Ncompte;
    private double solde;
    private String cin;
    public Banque(int Ncompte, double solde, String cin){
        this.Ncompte=Ncompte;
        this.solde=solde;
        this.cin=cin;
    }
    public void deposer(double solde){
        this.solde+=solde;
    }
    public void retirer(double solde){
        if(this.solde>solde)
            this.solde-=solde;
    }
    public double avoirSolde(){
        return solde;
    }
    public String avoirInformation(){
        return "compte "+" Ncompte= "+this.Ncompte+" solde= "+this.solde+" cin= "+this.cin;}
}
