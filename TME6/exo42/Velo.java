public class Velo extends SansMoteur {
	private int vitesse ;
	public Velo(String marque, int vitesse) {
		super(marque);
		this.vitesse = vitesse;
	}
	
	public String toString() {
		return "Vélo " + super.toString() + vitesse + (vitesse==1? " vitesse" : " vitesses");
	}
	
	public void transporter(String depart, String arrivee) {
		System.out.println("Vélo "+this.numid+" se déplace de "+depart+" à "+arrivee);
	}
}
