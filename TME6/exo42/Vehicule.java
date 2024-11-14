
public class Vehicule {
	protected final int numid ;
	private static int compteur = 1;
	protected String marque ;
	protected double distance = 0 ;
	
	public Vehicule(String marque) {
		numid = compteur ;
		compteur++;
		this.marque = marque;
	}
	
	public String toString() {
		return(""+ numid + " de marque " + marque);
	}
	
	public void rouler(double distance) {
		this.distance += distance;
		System.out.println(this.toString() + " a roulé " + distance + " km");
	}
}

