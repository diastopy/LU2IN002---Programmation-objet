public abstract class Instrument {
    private int poids; 
    private int prix;
    public Instrument (int poids, int prix){
        this.poids = poids;
        this.prix = prix; 
    }

    public String toString(){
        return ("poids : " + poids + " kg, prix : " + prix + " euros.");
    }

    public abstract void jouer();
}