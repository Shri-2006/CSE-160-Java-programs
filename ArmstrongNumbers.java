
//Shriyans Singh
import java.util.Scanner;

//import java.lang.Math;
public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the lower limit: ");
		int low = input.nextInt();
		System.out.print("Enter the upper limit: ");
		int up = input.nextInt();

		/*
		 * String[] upper = up.split(); String[] lower = low.split();
		 * 
		 * System.out.println(upper); System.out.println(lower);
		 */

		System.out.print("The armstrong numbers between " + low + " and " + up + " are: ");
		for (int n = low; n <= up; n++) {
			if (armstrong(n)) { // where did the name of this math come from anyways?
				System.out.print(n + " ");
			}
		}
		input.close();

	}

	public static boolean armstrong(int n) {
		int ori = n;
		int sum = 0;
		int numbers = String.valueOf(n).length();

		while (ori > 0) { // THIS TOOK ME 4 HOURS TO FIND THE BUG AHHHHHH(I put n instead of ori I feel so
							// stupid lol) [also i will be writing more in here cause why not:D] Anyways,
							// have a great day!
			int num = ori % 10;
			sum += Math.pow(num, numbers);
			ori = (ori / 10);

		}
		return sum == n;
	}

}
