public class TestAdresseWeb{
	public static void main(String[]args){
		AdresseWeb y1 = new AdresseWeb("http.","site.fr","/");
		AdresseWeb y2 = new AdresseWeb("site.fr","/");
		AdresseWeb y3 = new AdresseWeb("site.fr");
		
		System.out.println(y1.toString());
		System.out.println(y2.toString());
		System.out.println(y3.toString());
	}
}
