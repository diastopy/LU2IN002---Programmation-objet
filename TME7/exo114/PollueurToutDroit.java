public class PollueurToutDroit extends RobotPollueur{
    public PollueurToutDroit(int x, int y, Monde m){
        super(x,y,m);
    }

    public PollueurToutDroit(Monde m){
        super(m);
    }

    @Override
    public void parcourir(){
        for (int i = 0;i<m.nbL;i++){
            vaEn(i,posy);
            this.polluer();
        }
    }
}
