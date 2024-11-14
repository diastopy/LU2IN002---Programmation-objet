public class Orchestre  {
    private int cptInstr = 0;
    private Instrument [] tab;
    public Orchestre(int taille){
        this.tab = new Instrument [taille] ;
    }

    public void ajouterInstrument (Instrument x){
        tab[cptInstr]=x;
        cptInstr ++;;
    }

    public String toString(){
        String s = "L'orchestre : \n";
            for(int i=0; i<cptInstr;i++){
                s+="\t"+tab[i]+"\n";
            }
        return s;
    }
    
    public void jouer(){
      /*/  for (Instrument ins : tab){
            System.out.println(ins+" ");
        }*/
        for (Instrument ins : tab){
            ins.jouer();
        }
        System.out.println("L'orchestre joue.");
    }
}
