public class Voiture extends AMoteur {
	private int places;
	public Voiture (String marque, float cap, int places) {
		super(marque, cap);
		this.places = places;
	}

	public String toString() {
		return "Voiture " + super.toString() + " a "  + places+" places.";
	}

	public void transporter(int nbPers, int km){
		if (super.enpanne()){
			System.out.println("La voiture "+super.numid+" n'a plus d'essence");
		}
		else{
			System.out.println("La voiture "+super.numid+" transporte "+nbPers+" personnes sur "+km+" Km");
		}
	}
}
