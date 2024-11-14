import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSleep {
    public static void main(String [] args) throws InterruptedException{
        try{      
            monProg();
        } catch(InputMismatchException e){System.out.println("Le caractère entré n'est pas un int");}
          catch(InterruptedException e){System.out.println("Exception du sleep");}
    }

    public static void monProg() throws InterruptedException{
        Scanner s = new Scanner(System.in);
        System.out.print("Saisissez le nombre de secondes voulues : ");
        int x = s.nextInt();
        s.close();

        
        System.out.println("Attente de "+x+" secondes.");
        int ms = x*1000;
        Thread.sleep(ms);
        System.out.println("Fin de l'attente.");
    }
}
