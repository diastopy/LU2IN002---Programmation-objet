public class Projet{
    private  String nomProj;
    private static int cpt=0;
    private int nbProj;
    private Trio trio; 

    public Projet(String nomProj){
        this.nomProj=nomProj;
        trio = new Trio();
        cpt ++;
        nbProj = cpt; 
    }

    public String toString(){
        return "Projet "+nbProj+", "+nomProj+trio.toString();
    }

        public static String nbProjCree(){
        return "Nombre de projets créés : "+cpt;
    }

}