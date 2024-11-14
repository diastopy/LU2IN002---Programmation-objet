public class Alea{
    
    private Alea(){}

    public static char lettre(){
        return (char)(Math.random()*('z'-'a'+1)+'a');
    }

    public static String chaine(){
        String s ="(";
        for (int i=0; i<10; i++){
            s+=lettre();
        }
        s += ")";
        return s;
    }

    /*Les méthodes lettre et chaine sont des méthodes car il
    y a le clé "static"*/
    public static void main(String [] args){
        System.out.println(chaine());
    }
}