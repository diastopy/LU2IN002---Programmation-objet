public class Trio{
    private static int cptTrio=0;
    public int numTrio;
    private Personne [] tab;

    public Trio(){
        tab = new Personne[3]; 
        tab[0] = new Personne();
        tab[1] = new Personne();
        tab[2] = new Personne();

        cptTrio++;
        numTrio=cptTrio;
    }

    public String toString(){
        return "Trio"+numTrio+" : "+tab[0].toString()+" "+tab[1].toString()+" "+tab[2].toString();
    }

    public static String nbTrioCree(){
        return "Nombre de trios créés : "+cptTrio;
    }
}