public class Cabine{
	int volume;
	String couleur; 
	public Cabine(int volume, String couleur){
		this.volume=volume;
		this.couleur=couleur;
	}
	 
	public String toString(){
	 	return ("cabine : "+volume+" m3, couleur cabine : "+couleur+ "\n");
	}
	 
	public void setCouleur(String couleur){
		this.couleur=couleur;
	}
	
	public Cabine(Cabine cabine) {
		this.volume = cabine.volume ;
		this.couleur = cabine.couleur ;
	}
}
