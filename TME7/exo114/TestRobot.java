public class TestRobot {
    
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void main(String [] args){
        Monde monde1 = new Monde();
        //monde1.metPapierGras(3, 7);
        //monde1.metPapierGras(2, 9);
        System.out.println(monde1.toSring());
        //monde1.prendPapierGras(3, 7);
        //System.out.println(monde1.toSring());
        //monde1.estSale(2,9);
        Robot r1 = new PollueurToutDroit(2,4,monde1);
        Robot r2 = new PollueurToutDroit(6,7,monde1);
        Robot r3 = new PollueurSauteur(3,7,monde1,1);
        Robot r4 = new PollueurSauteur(2,9,monde1, 3);
        Robot r5 = new NettoyeurDistrait(0,0,monde1);

        r1.parcourir();
        System.out.println(monde1.toSring());
        r2.parcourir();
        System.out.println(monde1.toSring());
        r3.parcourir();
        System.out.println(monde1.toSring());
        r4.parcourir();
        System.out.println(monde1.toSring());
        r5.parcourir();
        System.out.println(monde1.toSring());
        //clearScreen();
    }
}
