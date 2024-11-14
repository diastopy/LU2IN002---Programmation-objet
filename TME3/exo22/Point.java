public class Point {
    private int posx;
    private int posy;

    public Point(){}

    public Point(int posx, int posy){
        this.posx=posx;
        this.posy=posy;
    }

    public void setPosx(int posx){
		this.posx=posx;
	}

    public void setPosy(int posy){
		this.posy=posy;
	}

    public int getPosx(){
   	    return posx;
	}

    public int getPosy(){
   	    return posy;
	}

    public String toString(){
        return "Point : ("+posx+", "+posy+")";
    }

    public double distance (Point p){
        return Math.sqrt(Math.pow((this.posx-p.posx),2)+Math.pow((this.posy-p.posy),2));
    }

    public void deplaceToi(int newx, int newy){
        this.posx=newx;
        this.posy=newy;
    }
}
