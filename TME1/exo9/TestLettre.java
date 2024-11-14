public class TestLettre {
    public static void main(String[]args){
        //getCodeAscii()
        //char c='B';
        char i;
        char j=0;
        for (i='a';i<='z';i++){
        Lettre test = new Lettre(i);
        System.out.println(test.getCodeAscii());
        }  
        for (i='a';i<='z';i++){
            Lettre test = new Lettre(i);
            if (j==4){
                System.out.print(test.getCarac());
                System.out.print("\n");
                j=0;
            }
           else{
                System.out.print(test.getCarac());
                j+=1;
            }
        }
        System.out.println();
    }
}
