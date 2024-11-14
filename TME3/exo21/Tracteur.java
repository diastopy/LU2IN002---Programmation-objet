public class Tracteur{
	private Roue r1 ;
	private Roue r2 ;
	private Roue r3 ;
	private Roue r4 ;
	private Cabine cabine ;
	
	public Tracteur(Cabine cabine, Roue r1, Roue r2, Roue r3, Roue r4){
	this.cabine = cabine ;
	this.r1 = r1 ;
	this.r2 = r2 ;
	this.r3 = r3 ; 
	this.r4 = r4 ;
	}
	
	public String toString() {
		return("Le tracteur est composé de quatre roues.\n" + r1.toString() + "\n" + r2.toString()+ "\n" + r3.toString() + "\n" + r4.toString() + "\n" + "Ainsi que d'une cabine.\n" + cabine.toString()) ;
	}
	
	public void peindre(String couleur){
		this.cabine.couleur=couleur;
	}
	
	public Tracteur(Tracteur tracteur) {
		this.r1 = new Roue(tracteur.r1) ;
		this.r2 = new Roue(tracteur.r2) ;
		this.r3 = new Roue(tracteur.r3);
		this.r4 = new Roue(tracteur.r4);
		this.cabine = new Cabine(tracteur.cabine) ;
	}
}
		
