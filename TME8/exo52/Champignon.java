public class Champignon implements Ramassable {
    private String nom;
    private double poids;

    public Champignon(String nom, double poids){
        this.nom=nom;
        this.poids=poids;
    }

    public double getPoids(){
        return poids;
    }

    public String toString(){
        return (nom + " "+ poids+"kg");
    }
}
