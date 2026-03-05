//Shriyans Singh 114807762
import java.lang.Math;
public class Emirp { //I think this should work....maybe 																											//DID NOT WORK WHY IS MAIN THROWING AHHHH
    public static void main(String[] args) {
        int count = 0, number = 10; 
        String result = "";

       do {
            if (prime(number) && pal(number) && prime(back(number))) {
                result += number + " "; 
                count++;
            }
            number++;
        } while (count < 100);
        System.out.println(result.strip());
    }
    
    
    
    
    
    
    
    																																	//SO MANY ERRORS AHHHHHHHHHHHHHH
    public static int back(int number) {																		//this should reverse the code.... WHY IS STACKFLOW SO HARD TO UNDERSTANDDDD
        int backwards = 0;
        while (number > 0) {
            int num = number % 10;
            backwards = backwards * 10 + num; 
            number /= 10; 
        }
        return backwards;
    }
    
    public static boolean prime(int number) {											//FIRST TRY AYYYYYYYY(defintely didn't look at past labs for this class....)
        if (number <= 1) {
        	return false; 
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
            	return false; 
            }
        }
        return true;
    }

   
    public static boolean pal(int number) {							//returns if not palindrome DEBUGGING WORKED HAHAHAHAHAHAHA
        int reversed = back(number); 
        return number != reversed; 
    }

  
   
}
