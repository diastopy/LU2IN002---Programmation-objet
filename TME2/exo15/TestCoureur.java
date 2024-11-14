public class TestCoureur{
	public static void main(String[]args){
		Coureur c1 = new Coureur();
		Coureur c2 = new Coureur();
		Coureur c3 = new Coureur();
		Coureur c4 = new Coureur();
		System.out.println("\n");
		c1.courir();
		c1.passeTemoin(c2);
		System.out.println(c1.toString());
		c2.courir();
		c2.passeTemoin(c3);
		System.out.println(c2.toString());
		c3.courir();
		c3.passeTemoin(c4);
		System.out.println(c3.toString());
		c4.courir();
		c4.setPossedeTemoin(true);
		System.out.println(c4.toString());
		System.out.println("\n");
		double tempsTotal = c1.temps() + c2.temps() + c3.temps() + c4.temps();
		System.out.println("Le temps total mis par les coureurs pour faire les 400m est de "+String.format("%.2f",tempsTotal)+"s");
		System.out.println("\n");
	}
}
