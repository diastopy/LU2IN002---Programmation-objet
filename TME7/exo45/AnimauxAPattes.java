public abstract class AnimauxAPattes extends Animal {
    protected int nbPattes;
    public AnimauxAPattes( String nom, int age, int nbPattes){
        super(nom,age);
        this.nbPattes=nbPattes;
    }
    public AnimauxAPattes(String nom, int nbPattes){
        super(nom);
        this.nbPattes=nbPattes;
    }

    public String toString(){
        return super.toString()+" et "+nbPattes+" pattes, ";
    }
    public abstract void crier();
}
