public abstract class RobotPollueur extends Robot {
    protected RobotPollueur(int x, int y, Monde m){
        super(x,y,m);
    }

    protected RobotPollueur(Monde m){
        super(m);
    }

    public void polluer(){
        m.metPapierGras(posx,posy);
    }
}
