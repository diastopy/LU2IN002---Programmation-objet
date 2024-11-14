public class TestPile {
    public static void main(String[]args){
        Machin m1 = new Machin(0, "Assiette");
        Machin m2 = new Machin(1, "Thermos");
        Machin m3 = new Machin(2, "Tour Eiffel");
        Machin m4 = new Machin(3, "Gros coton tige");
        Machin m5 = new Machin(4, "Samosa");
        Pile p1 = new Pile(3);
        p1.empiler(m1);
        p1.empiler(m2);
        p1.empiler(m3);
        System.out.println(p1.toString());
        p1.depiler();
        System.out.println(p1.toString());
        p1.empiler(m4);
        p1.empiler(m5);
        System.out.println(p1.toString());
        p1.depiler();
        p1.depiler();
        p1.depiler();
        p1.depiler();
        System.out.println(p1.toString());
    }
}
