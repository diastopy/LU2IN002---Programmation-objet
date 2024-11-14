public class Coureur{
	private int numDossard;
	private double tempsAu100;
	private boolean possedeTemoin;
	
	public Coureur(int numDossard){
		this.numDossard =numDossard;
		tempsAu100 = Math.random()*(16-12)+12;
		possedeTemoin = false;
	}
	
	public Coureur(){
		this((int)(Math.random()*(1000)+1));
	}
	
	public void setPossedeTemoin(boolean possedeTemoin){
		this.possedeTemoin=possedeTemoin;
	}
	
	public void passeTemoin(Coureur c){
		System.out.println("moi,coureur "+numDossard+", je passe le témoin au coureur "+c.numDossard+".");
	}
	public void courir(){
		System.out.println("je suis le coureur "+numDossard+" et je cours");
	}
	
	public double temps(){
		return tempsAu100;
	}
	
	public String toString(){
		return "Coureur " +numDossard+" tempsAu100 : "+String.format("%.2f",tempsAu100)+"s au 100m possedeTemoin : "+(possedeTemoin? "oui" : "non");
	}
	
	public int getNumDossard(){return numDossard;}
	public double getTempsAu100(){return tempsAu100;}
	public boolean getPossedeTemoin(){return possedeTemoin;}
}
