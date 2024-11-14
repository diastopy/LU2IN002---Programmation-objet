public abstract class Animal{
    /* Gauvain Bourgne */
    protected String nom;
    protected int age;
    public Animal(String nom, int age){
        this.nom=nom;
        this.age=age;
    }
    public Animal(String nom){
        this.nom=nom;
        age=1;
    }

    public String toString(){
        return ("Animal appelé : "+nom+" a "+age+" ans ");
    }

    public void vieillir(){
         age++;
    }

    public abstract void crier();

}