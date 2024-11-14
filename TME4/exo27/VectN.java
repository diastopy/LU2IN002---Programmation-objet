public class VectN{
    private int [] tab;

    private VectN(int n){
        this.tab = new int [n];
    }
    
    public VectN(int n, int valMax){
        this(n) ;
        for(int x=0; x<n; x++) {
            tab[x] = (int) (Math.random()*(valMax +1)) ;
        }
    }

    public VectN(){
        this(5, 9);
    }
    
    public VectN(int a, int b, int c){
        this(3);
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;
    }

    public String toString() {
        if (tab.length == 0){
            return "[]";
        }
        StringBuilder s = new StringBuilder();
        s.append ("[");
        int x;
        for(x=0; x+1<tab.length; x++){
            s.append(tab[x] + ", ");
        }
        s.append(tab[x] + "]");
        return s.toString();
    }

    public int somme(){
        int s=0;
        for(int x : tab){
            s+=x;
        }
        return s;
    }

    public int [] getTab() {
        int [] tablo = new int [tab.length] ;
        for(int x=0; x<tab.length; x++) {
            tablo[x] = tab[x];
        }
        return tablo;
    }
}