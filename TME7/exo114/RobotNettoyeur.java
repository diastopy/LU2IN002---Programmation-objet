public class RobotNettoyeur extends Robot{
    public RobotNettoyeur(int x, int y, Monde m){
        super(x,y,m);
    }

    public RobotNettoyeur(Monde m){
        super(m);
    }
    public void nettoyer(){
        m.prendPapierGras(posx,posy);
    }

    public void parcourir(){
        for (int i = 0;i<m.nbL;i++){
            if (i%2 == 0){
                for(int j=0;j<m.nbC;j++){
                    vaEn(i, j);
                    this.nettoyer();
                }
            }

            else{
                for(int k=m.nbC-1;k>=0;k--){
                    vaEn(i, k);
                    this.nettoyer();
                }
            }
        }
    }
}
