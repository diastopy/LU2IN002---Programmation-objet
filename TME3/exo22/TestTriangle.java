public class TestTriangle {
    public static void main(String[]args){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,2);
        Point p3 = new Point(2,1);
        Triangle T1 = new Triangle(p1, p2, p3);

        System.out.println(T1.toString());
        System.out.println("Voici le perimetre du triangle :"+String.format("%.2f",T1.getPerimetre())+"cm");
    }
}
