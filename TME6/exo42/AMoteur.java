public class AMoteur extends Vehicule {
	private final float capres ;
	private float nivess = 0 ;
	
	public AMoteur(String marque, float capres) {
		super(marque);
		this.capres = capres;
	}
	
	public String toString() {
		return (super.toString() + " avec moteur, de réservoir " + 
				capres + " litres et " + nivess + " litre(s) d'essence");
	}
	
	public void approvisionner(double nbLitres) {
		if(nbLitres <= 0) {
			System.out.println("Nombre de litres incorrect");
		}
		if(nivess+nbLitres > capres) {
			nivess=capres ;
			System.out.println("Vous avez essayé de remplir plus que la capacité maximale du réservoir ! Oops, un peu d'essence a été perdue");
		}
		else{this.nivess += nbLitres;}
		
		System.out.println("Le véhicule "+numid+" a " + nivess + " litres d'essence");
	}
	
	public boolean enpanne() {
		return nivess<=0 ;
	}
	
}
