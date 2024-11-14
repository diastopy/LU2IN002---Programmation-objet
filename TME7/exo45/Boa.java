public class Boa extends AnimauxSansPattes {
    public Boa(String nom, int age){
        super(nom,age);
    }

    public Boa(String nom){
        super(nom);
    }

    public String toString(){
        return super.toString() + " boa. ";
    }

    @Override
    public void crier(){
        System.out.println("Ssssssssssssssssss");
    }
}
