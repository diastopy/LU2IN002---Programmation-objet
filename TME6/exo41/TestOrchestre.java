public class TestOrchestre {
    public static void main(String [] args){
        System.out.print("\n");
        Piano p1 = new Piano(88,300,700);
        Guitare g1 = new Guitare("Electrique", 10, 500);
        System.out.println(p1.toString());
        System.out.println(g1.toString());
        System.out.print("\n");
        Orchestre o1 = new Orchestre(2);
        o1.ajouterInstrument(p1);
        o1.ajouterInstrument(g1);

        o1.jouer();
        System.out.print("\n");
        System.out.println(o1.toString());
    }
}
