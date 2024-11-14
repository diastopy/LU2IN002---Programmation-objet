public class TestEntierBorne {
    public static void main(String [] args){
        int x =(int)(Math.random()*(300-0+1)+0);
        x = x - 150;
        int y = (int)(Math.random()*(2-0+1)+0);
        try{
        EntierBorne ebX = new EntierBorne(x);
        EntierBorne ebY  = new EntierBorne(y);
        EntierBorne ebS = ebX.somme(ebY);
        System.out.println(ebX);
        System.out.println(ebY);
        System.out.println(ebS);
        EntierBorne ebD = ebX.divPar(ebY);
        System.out.println(ebD);
        } catch (Exception e){System.out.println("Fin.");}
        //catch (HorsBornesException e){System.out.println("C'est tout pété");}
        //catch (DivisionParZeroException e){}
    }
}