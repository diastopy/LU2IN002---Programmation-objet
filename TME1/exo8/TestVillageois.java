public class TestVillageois{
    public static void main(String[]args){
   	 Villageois etienne = new Villageois("Etienne") ;
   	 Villageois andrea = new Villageois("Andrea") ;
   	 Villageois enzo = new Villageois("Enzo") ;
   	 Villageois caroline = new Villageois("Caroline") ;
   	 
   	 System.out.println(etienne.toString());
   	 System.out.println(andrea.toString());
   	 System.out.println(enzo.toString());
   	 System.out.println(caroline.toString());
   	 
   	 System.out.println("Nom : " + etienne.getNom());
   	 System.out.println("Poids : " + andrea.getPoids());
   	 System.out.println("Malade :" + enzo.getMalade());
   	 
   	 double poidstotalsoulev = etienne.poidsSouleve() + andrea.poidsSouleve() + enzo.poidsSouleve() + caroline.poidsSouleve()    ;
   	 
   	 System.out.println((poidstotalsoulev >= 100)? "Les villageois soulèvent le rocher !" : "Les villageois ne soulevent pas le rocher :((");
    }
}
