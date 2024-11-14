public class TestPoint {
    public static void main(String[]args){
        Point p1 = new Point(3,5);
        Point p2 = new Point(12,6);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.getPosx());
        System.out.println(p1.getPosy());
        System.out.println("distance :"+p1.distance(p2));
    }    
}
