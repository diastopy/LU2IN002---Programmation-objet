public abstract class Robot {
    protected int posx,posy;
    protected Monde m;

    public Robot(int x,int y,Monde m){
        posx=x;
        posy=y;
        this.m=m;
    }

    public Robot(Monde m){
        posx = (int)(Math.random()*(m.nbL));
        posy = (int)(Math.random()*(m.nbC));
        this.m=m;
    }

    public void vaEn(int i, int j){
        if ((i >= 0) && (i<m.nbL) && (j>=0) && (j<m.nbC)){
            posx=i;
            posy=j;
        }
    }

    public abstract void parcourir();
}
