public class PollueurSauteur extends RobotPollueur {
    private int deltax;
    public PollueurSauteur(int x, int y, Monde m, int d){
        super(x,y,m);
        deltax=d;
    }

    public PollueurSauteur(Monde m,int d){
        super(m);
        deltax=d;
    }

    @Override
    public void parcourir(){
        int colDepart = posy;
        for (int i = 0;i<m.nbL;i++){
            if (i%2 == 0){vaEn(i,colDepart);}
            else{vaEn(i, ((colDepart+deltax)%m.nbC));}
            this.polluer();
        }
    }
}
