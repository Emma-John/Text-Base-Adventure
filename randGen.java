import java.lang.Math;

public class randGen{


    public static int RanInt(int min, int max){

      // Generating random numbers  
      int b = (int)(Math.random()*(max-min+1)+min); 
       

        return b; 


}
}