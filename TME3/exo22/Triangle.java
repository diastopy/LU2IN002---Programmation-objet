public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;
    public Triangle(){}

    public Triangle(Point p1, Point p2, Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public double getPerimetre(){
        System.out.println("Distance p1 et p2 : "+String.format("%.2f",p1.distance(p2)));
        System.out.println("Distance p2 et p3 : "+String.format("%.2f",p2.distance(p3)));
        System.out.println("Distance p3 et p1 : "+String.format("%.2f",p3.distance(p1)));
        double s = p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
        return s;
    }
    public String toString(){
        return ("Le Triangle est compose d'un point p1 de coordonnees "+this.p1+", d'un point p2 de coordonnees "+this.p2+" et d'un point p3 de coordonnees"+this.p3);
    }
}
