public abstract class AnimauxSansPattes extends Animal {
    public AnimauxSansPattes( String nom, int age){
        super(nom,age);
    }
    public AnimauxSansPattes(String nom){
        super(nom);
    }

    public String toString(){
        return super.toString();
    }
    public abstract void crier();
}
