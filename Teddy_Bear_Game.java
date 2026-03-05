package Lab24;
import java.util.Scanner;
//Shriyans Singh 114807762
public class Teddy_Bear_Game {
	
	public static boolean TeddyBearGame(int initial, int goal, int increment, int n) {
		if(initial ==goal) {
			return true;
		}
		if(n<=0) {
			return false;
		}
		if((initial % 2 == 0) && TeddyBearGame(initial/2,goal,increment,n-1)) {
			System.out.println("Divided by 2: "+ (initial/2));
			return true;
		}
		if(TeddyBearGame(initial+increment, goal, increment, n -1)) {
			System.out.println("Incremented by "+increment+" : "+ (initial+increment));
			return true;
			
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println(TeddyBearGame(99,91,53,4));
		
		
		
		/*int initial;
		int n;
		int increment;
		int goal;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial: ");
		initial=input.nextInt();
		System.out.println("Enter n: ");
		n=input.nextInt();
		System.out.println("Enter increment: ");
		increment=input.nextInt();
		System.out.println("Enter goal: ");
		goal=input.nextInt();
*/
	}

}
