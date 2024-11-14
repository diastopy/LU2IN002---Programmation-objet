public class TestComplexe {
    public static void main(String[]args){
        Complexe c1 = new Complexe();
        Complexe c2 = new Complexe();
        Complexe c3 = new Complexe();
        System.out.println("\n");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.print("\n");
        c1.estReel();
        c2.estReel();
        c3.estReel();
        System.out.print("\n");
        System.out.println(c1.addition(c2));
        System.out.println(c1.addition(c3));
        System.out.println(c2.addition(c3));
        System.out.print("\n");
        System.out.println(c1.multiplication(c2));
        System.out.println(c1.multiplication(c3));
        System.out.println(c2.multiplication(c3));
        System.out.print("\n");
    }
}
