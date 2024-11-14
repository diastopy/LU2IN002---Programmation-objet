public class Menagerie {
    private Animal [] tab;
    private int cpt;
    public Menagerie(int taille){
        tab = new Animal[taille];
        cpt = 0;
    }

    public void ajouter(Animal a){
        if (cpt >= tab.length){
            System.out.println("Erreur : Tableau plein");
        }
        else{
            tab[cpt]=a;
            cpt++;
        }
    }

    public String toString(){
        String s = "La menagerie est composée de ";
        for (int i = 0; i<tab.length;i++){
            s +=tab[i].toString()+"\n";
        }
        return s;
    }

    public void midi(){
        for (int i = 0; i<tab.length;i++){
            tab[i].crier();
        }
    }

    public void vieillirTous(){
        for (int i = 0; i<tab.length;i++){
            tab[i].vieillir();
        }
    }


}
