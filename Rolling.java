//Shriyans Singh 114807762
import java.util.Scanner;

public class Rolling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fDie= (int) (Math.random()*6)+1;
		int sDie=(int)(Math.random()*6)+1;
		
		System.out.println("The first die comes up: "+fDie);
		System.out.println("The second die comes up: "+sDie);
		
		int sum= fDie+sDie;
		System.out.println("Your total roll is "+sum);
		
	}

}
