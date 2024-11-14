public class TestForet {
    public static void main(String []args ){
        Foret terrain = new Foret(10);
        Object [] tab = new Object[15];
        int i;
        for (i = 0; i<10;i++){
            boolean a = Math.random()<0.3;
            if (a){
                tab[i]=new Arbre("Pin");
                terrain.placer(tab[i]);
            }
            else{
                tab[i]=new Champignon("Cèpe",(Math.random()*(5-0.2)+0.2));
                terrain.placer(tab[i]);
            }
        }       
        for (;i<tab.length;i++){
            tab[i]= new ChampignonToxique("Amanite",(Math.random()*(5-0.2)+0.2));
            terrain.placer(tab[i]);
        }
        System.out.println(terrain.toString());
        terrain.ramasserTout();
        System.out.println(terrain);
    }
}
