public class Personne{
	private String nom;
	private Personne conjoint;
	
	public Personne(){
		this("pers");
		nom = nom + tirageLettre() + tirageLettre() + tirageLettre();
		conjoint = null;
	}
	
	public Personne (String nom){
		this.nom=nom;
	}
	
	public Personne (String nom, Personne conjoint){
		this.nom=nom;
		this.conjoint = conjoint;
	}
	
	public boolean isCelib(){
		return conjoint==null;
	}
	
	private char tirageLettre(){
		return(char)(Math.random()*26 + 'A');
	}
	
	public String toString(){
		return nom+	(isCelib()? ", celibataire" : ", marie(e) avec "+conjoint.nom) ;
	}
	
	public void epouser(Personne p) {
		if(isCelib() && p.isCelib()){
			this.conjoint = p;
			p.conjoint=this;

		}
		else {System.out.println("Ce mariage est impossible !");}
	}
	
	public void divorce(Personne p) {
		if(isCelib() && p.isCelib()){
			System.out.println("Cette personne n'est pas mariée !");
		}
		else{
			this.conjoint = null;
			p.conjoint=null;
		}
	}
	public static void main(String[]args){
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = new Personne();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		p1.epouser(p2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.epouser(p3);
		p1.divorce(p2);
		System.out.println(p1.toString());
		p1.epouser(p3);
		System.out.println(p1.toString());
		System.out.println(p3.toString());
	}
}
