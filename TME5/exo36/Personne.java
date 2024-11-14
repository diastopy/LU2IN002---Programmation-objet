public class Personne{
    String nom; 
    private static int nbPersonnes = 0;
    private static char letPersonnes = 'A';

    public Personne(){
        nbPersonnes++;
        
        nom=("Individu"+letPersonnes);
        letPersonnes++;
    }

    public String toString(){
        return nom;
    }

    public static int getNbPersonne(){
        return nbPersonnes;
    }

    public static String nbPersCree(){
        return "Nombre de personnes créées : "+nbPersonnes;
    }
}