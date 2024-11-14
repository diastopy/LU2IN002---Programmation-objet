public class TestVectN {
    public static void main(String[]args){
        VectN v0 = new VectN(3, 5);
        VectN v1 = new VectN();
        VectN v2 = new VectN(1, 2, 3);
    
    System.out.println(v0.toString());
    System.out.println(v1.toString());
    System.out.println(v2.toString());    

    System.out.println(v0.somme());
    System.out.println(v1.somme());
    System.out.println(v2.somme());

    VectN vecttest = new VectN(4,5,6);
    int [] tab = vecttest.getTab();
    tab[0] = 100;
    System.out.println(vecttest);
    }
}