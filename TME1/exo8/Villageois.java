public class Villageois{
    private String nom;
    private double poids;
    private boolean malade;
    public Villageois(String nomVillageois){
   	 nom = nomVillageois;
   	 poids = Math.random()*(150-50)+50;
   	 malade = Math.random()<0.2;
   	 }
    public String toString(){
   	 double soulev = poidsSouleve();
   	 return "villageois : " + nom + ", poids : " + String.format("%.2f",poids) + " kg, malade : "
   	     			 + (malade? "oui" : "non") + ", peut soulever " + String.format("%.2f",soulev) + " kg";
    }
    
    public double poidsSouleve(){
   	 return(malade? poids/4 : poids/3) ;
    }
    
    
    public String getNom(){
   	 return nom;
    }
	public double getPoids(){
   	 return poids;
	}
    public boolean getMalade(){
   	 return malade;
    }

}
