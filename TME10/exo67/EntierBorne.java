public class EntierBorne {
    private int valeur;
    public final static int MAX = 100;
    public final static int MIN = -100;
    public EntierBorne(int x) throws HorsBornesException{
        if (x>MAX){
            throw new HorsBornesException("Entier trop grand : "+x);
        }
        else if (x<MIN){
            throw new HorsBornesException("Entier trop petit : "+x);
        }
        valeur=x;
    }
    
    public EntierBorne somme(EntierBorne eb) throws HorsBornesException{
        return new EntierBorne(valeur + eb.valeur);
    }

    public EntierBorne divPar(EntierBorne eb) throws DivisionParZeroException, HorsBornesException{
        if (eb.valeur==0){throw new DivisionParZeroException();}
        return new EntierBorne(this.valeur/eb.valeur);
    }

    public String toString(){
        return ("L'entier est x="+valeur);
    }
}
