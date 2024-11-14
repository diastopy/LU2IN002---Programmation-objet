public class Pile{
    private int nbpres ;
    private int valmax ;
    private Machin [] tab ;

    public Pile(int valMax){
        this.valmax = valMax ;
        this.tab = new Machin [valMax];
        this.nbpres = 0 ;
    }

    public boolean estVide() {
        return (nbpres == 0);
    }

    public boolean estPleine() {
        return (nbpres == this.valmax);
    }

    public void empiler(Machin m) {
        if (!estPleine()) {
            for (int i = nbpres; i > 0; i--) {
                tab[i] = tab[i - 1];
            }
            tab[0] = m;
            nbpres += 1;
        } else {
            System.out.println("Echec d'empilement du " + m.toString() + ".\nLa pile est pleine.");
        }
    }

    public Machin depiler() {
        if (!estVide()) {
            Machin m = tab[0];
            for (int i = 1; i < valmax; i++) {
                tab[i - 1] = tab[i];
            }
            nbpres -= 1;
            return m;
        }
        return null;
    }

    public String toString() {
        StringBuilder s = new StringBuilder() ;
        s.append("Nom:\tValeur:\n");    
        if(!estVide()){
            for(int i=0;i<nbpres;i++) {
                s.append(tab[i].toString()+"\n");
            }
        }
        return s.toString();
    }
}