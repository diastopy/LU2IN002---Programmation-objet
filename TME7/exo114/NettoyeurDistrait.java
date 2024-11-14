public class NettoyeurDistrait extends RobotNettoyeur {
    public NettoyeurDistrait(int x, int y, Monde m){
        super(x,y,m);
    }

    public NettoyeurDistrait(Monde m){
        super(m);
    }

    public void parcourir(){
        int k = 0;
        for (int i = 0;i<m.nbL;i++){
            if (i%2 == 0){
                for(int j=0;j<m.nbC;j++){
                    vaEn(i, j);
                    if (m.estSale(i,j)){
                        if (k%2==0){
                            this.nettoyer();
                        }
                        k++;
                    }
                }
            }

            else{
                for(int j=m.nbC-1;j>=0;j--){
                    vaEn(i, j);
                    if (m.estSale(i,j)){
                        if (k%2==0){
                            this.nettoyer();
                        }
                        k++;
                    }
                }
            }
        }
    }
}
