public class TestProjet{
    public static void main(String [] args){
        System.out.println("\n"+Personne.nbPersCree());
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        Projet t1 = new Projet ("P3X-774");
        Projet t2 = new Projet ("P3R-233");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.print(Personne.nbPersCree()+"\n");
        System.out.print(Trio.nbTrioCree()+"\n");
        System.out.println(Projet.nbProjCree()+"\n");
    }
}