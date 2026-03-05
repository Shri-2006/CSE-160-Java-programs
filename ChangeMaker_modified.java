
//Shriyans Singh 114807762
import java.util.Scanner;

public class ChangeMaker_modified {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Price: $");

		double price = input.nextDouble();

		System.out.print("Amount: $");

		double amount = input.nextDouble();

		double change = amount - price;

		System.out.printf("Change: %.2f\n", change);

		int rem = (int) (Math.round(change * 100));

		extract(rem, 10000, "$100");

		rem = rem % 10000;

		extract(rem, 5000, "$50");

		rem = rem % 5000;

		extract(rem, 2000, "$20");

		rem = rem % 2000;

		extract(rem, 1000, "$10");

		rem = rem % 1000;

		extract(rem, 500, "$5");

		rem = rem % 500;

		extract(rem, 100, "$1");

		rem = rem % 100;

		extract(rem, 25, "25c");

		rem = rem % 25;


		extract(rem, 10, "10c");

		rem = rem % 10;

		extract(rem, 5, "5c");

		rem = rem % 5;

		if (rem != 0)

			System.out.println(rem + " x 1c");

	}

	public static void extract(int rem, int den, String p) {

		int x = rem / den;

		if (x != 0)

			System.out.println(x + " x " + p);

	}

}