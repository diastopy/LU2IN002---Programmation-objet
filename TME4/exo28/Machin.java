public class Machin{
    private int valeur;
    private String nom;

    public Machin(int valeur, String nom){
        this.valeur = valeur ;
        this.nom = nom ;
    }

    public String toString() {
        return(nom+"\t"+ valeur);
    }
}