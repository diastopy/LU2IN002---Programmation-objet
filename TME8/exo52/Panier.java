import java.util.ArrayList;

public class Panier extends ArrayList<Ramassable>{
    private final double poidsMax;
    public Panier(double pm){
        poidsMax=pm;
    }
    public double getPoids(){
        double poids = 0;
        for (Ramassable obj : this)
            poids += obj.getPoids();
        return poids;
    }
    @Override
    public boolean add(Ramassable obj){
        double poidsObj = obj.getPoids();
        
        if (this.getPoids() + poidsObj <= poidsMax){
            super.add(obj);
            System.out.println(obj+" a été ajouté au panier");
        return true;
        }
        else{
            System.out.println(obj+" n'a pas pu être ajouté au panier");
            return false;
        }

    }

    public int compterToxiques(){
        int res = 0;
        for (Toxique obj : this){
            if (obj instanceof Toxique){
                res ++;
            }
        } 
        return res;
    }

    
    
}
