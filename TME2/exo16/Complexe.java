public class Complexe{
    private double reelle;
    private double imag;

    public Complexe(double reelle, double imag){
        this.reelle=reelle;
        this.imag=imag;
    } 

    public Complexe(){
        this(Math.random()*(2+2)-2,Math.random()*(2+2)-2);
    }

    public String toString(){
		String s=String.format("%.2f",reelle)+(imag>0? "+" : "")+String.format("%.2f",imag)+"i";
		return s;
    }
    
    public void estReel(){
        if (imag == 0){System.out.println("Est reel");}
        else{System.out.println("n'est pas reel");}
    }

    public Complexe addition(Complexe c){
        c.reelle = this.reelle + c.reelle;
        c.imag = this.imag + c.imag;
        return c;
    }

    public Complexe multiplication(Complexe c){
        c.reelle = this.reelle * c.reelle - this.imag * c.imag;
        c.imag = this.reelle * c.imag - this.imag * c.reelle;
        return c;
    }
}
