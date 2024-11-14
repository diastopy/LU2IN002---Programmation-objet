
public class TestVehicule {

	public static void main(String[] args) {
		Velo vtt = new Velo("MyVTT", 17);
		System.out.println(vtt.toString());
		vtt.transporter("Paris","Lyon");
		vtt.rouler(10.0);

		System.out.println();
		Voiture renault = new Voiture("Renault", 42, 7);
		System.out.println(renault.toString());
		renault.approvisionner(23);
		renault.enpanne();
		renault.transporter(6, 187);
		renault.rouler(187.0);

		System.out.println();
		Camion ad = new Camion("Ada", 75, 15);
		System.out.println(ad.toString());
		ad.approvisionner(23);
		ad.enpanne();
		ad.transporter("Tuiles", 500);
		ad.rouler(500.0);

		System.out.println();
		Vehicule [] tab=new Vehicule[3];
		tab[0]=vtt;tab[1]=renault;tab[2]=ad;
		for (Vehicule x : tab){
			System.out.println(x);
		}
		for (Vehicule x : tab){
			x.rouler(10.0);
		}
	}

}
