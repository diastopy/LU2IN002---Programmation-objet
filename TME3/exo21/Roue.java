public class Roue{
	private int diametre;
	public Roue(int diametre){
		this.diametre=diametre;
	}
	public Roue(){
		this(60);
	}
	public String toString() {
		return ("roue : "+diametre+" cm");
	}
	public Roue(Roue r){
		this.diametre = r.diametre ;
	}
}	
