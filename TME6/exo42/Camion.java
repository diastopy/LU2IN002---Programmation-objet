public class Camion extends AMoteur {
    float volume;
    public Camion(String marque,float cap, float volume ){
        super(marque, cap);
		this.volume = volume;
	}

	public String toString() {
		return "Camion " + super.toString() + " a "  + volume+" m3.";
	}

	public void transporter(String materiau, int km){
		if (super.enpanne()){
			System.out.println("Le camion "+super.numid+" n'a plus d'essence");
		}
		else{
			System.out.println("Le camion "+super.numid+" a transporté des "+materiau+" sur "+km+" Km");
		}
	}

}
