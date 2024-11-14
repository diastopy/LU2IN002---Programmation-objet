public class TestSegment{
    public static void main(String[]args){
   	 Segment joachim = new Segment(6,8);
   	 Segment veronique = new Segment(12,5);
   	 System.out.println(joachim.toString());
   	 System.out.println(veronique.toString());
   	 if (joachim.longueur()>veronique.longueur()){
   		 System.out.println("Joachim est le segment le plus long");
   	 }
   	 else{
   		 System.out.println("Veronique est le segment le plus long");
   	 }

    }
}
