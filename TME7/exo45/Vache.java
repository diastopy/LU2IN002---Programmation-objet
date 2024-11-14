public class Vache extends AnimauxAPattes {
    private double quantiteLait;
    public Vache(String nom, int age){
        super(nom,age,4);
        quantiteLait = Math.random()*(30-5)+5;
    }

    public Vache(String nom){
        super(nom,4);
        quantiteLait = Math.random()*(30-5)+5;
    }

    public String toString(){
        return super.toString() + " vache dont la quantité de lait produite par jour est " + quantiteLait + "Litres";
    }

    @Override
    public void crier(){
        System.out.println("Meuuuuuuh");
    }
}
