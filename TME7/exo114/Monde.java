public class Monde {
    public final int nbL,nbC;
    private boolean [][] monde;

    public Monde(int nbL, int nbC){
        this.nbL=nbL;
        this.nbC=nbC;
        monde = new boolean[nbL][nbC];
        for (int i = 0;i<nbL;i++){
            for (int j = 0;j<nbC;j++){
                monde[i][j]=false;
            }
        }
    }

    public Monde(){
        nbL=10;
        nbC=10;
        monde = new boolean[10][10];
    }

    public String toSring(){
        String s = "";
        for (int i = 0;i<nbL;i++){
            for (int j = 0;j<nbC;j++){
                s+=(monde[i][j]? "o" : ".");
            }
            s+="\n";
        }
        return s;
    }

    public void metPapierGras(int i, int j){
        if ((i >= 0) && (i< nbL) && (j>=0) && (j<nbC)){
            monde[i][j]=true;
        }
    }

    public void prendPapierGras(int i, int j){
        if ((i >= 0) && (i< nbL) && (j>=0) && (j<nbC)){
            monde[i][j]=false;
        }
    }

    public boolean estSale(int i, int j){
        if ((i >= 0) && (i< nbL) && (j>=0) && (j<nbC)){
            if (monde[i][j] == true){
                return true;
            }
        }
        return false;
    }

    public int nbPapierGras(){
        int nbPapier=0;
        for (int i=0; i<nbL;i++){
            for (int j=0;j<nbC;j++){
                if (monde[i][j] == true){
                    nbPapier+=1;
                }
            }
        }
        return nbPapier;
    }
}