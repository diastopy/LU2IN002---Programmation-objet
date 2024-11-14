public class TestTracteur{
	public static void main(String[]args){
		Roue r1 = new Roue(120);
		Roue r2 = new Roue(120);
		Roue r3 = new Roue();
		Roue r4 = new Roue();
		
		Cabine cabine = new Cabine(3,"bleu");
		
		Tracteur t1 = new Tracteur(cabine,r1,r2,r3,r4);
		Tracteur t2 = t1;
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		System.out.println(cabine.toString());
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		t2.peindre("rouge");
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		/* 21.8/ 
				La couleur a changé car les deux tracteurs ont la même adresse mémoire
				Il faut faire une fonction copie dans les trois classes.
		*/
		
		Tracteur t3 = new Tracteur(t1) ;
		t3.peindre("jaune");
		
		System.out.println(t1.toString());
		System.out.println(t3.toString());
	}
}
