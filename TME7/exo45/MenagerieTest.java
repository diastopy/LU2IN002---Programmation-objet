public class MenagerieTest {
    public static void main(String [] args){
        Menagerie m1 = new Menagerie(5);
        Vache v1 = new Vache("Bernard");
        Vache v2 = new Vache("Bernado",3);
        Boa b1 = new Boa("Bernadinio");
        Boa b2 = new Boa("Bernadinioti");
        Animal v3 = new Vache("Bernardette",2);

        m1.ajouter(v1);
        m1.ajouter(v2);
        m1.ajouter(v3);
        m1.ajouter(b1);
        m1.ajouter(b2);

        System.out.print(m1.toString());
        m1.vieillirTous();
        System.out.print(m1.toString());
        m1.midi();
    }
}