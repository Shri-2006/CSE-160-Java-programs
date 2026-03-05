
//Shriyans Singh 114807762
import java.util.Scanner;

public class ShowMeTheMoney {
	public static void main(String[] args) {
		int change, rem, fart, pen, shil, ster;
		System.out.println("Enter in the number of farthings: ");
		Scanner input = new Scanner(System.in);
		change = input.nextInt();
		ster = change / (20 * 12 * 4);
		rem = change % (20 * 12 * 4);
		shil = rem / (12 * 4);
		rem = rem % (12 * 4);
		pen = rem / 4;
		fart = rem % 4;

		System.out.println(
				" Pound Sterling = " + ster + "\n Shilling = " + shil + "\n Penny = " + pen + "\n Farthings = " + fart);
		input.close();
	}

}
