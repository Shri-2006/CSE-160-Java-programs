//Shriyans Singh 114807762

import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {
		int dozen, total, individual;
		double dozen_price = 3.25, individual_price = 0.45;
		System.out.print("Enter Number of Eggs in the order: ");
		Scanner input = new Scanner(System.in);
		total = input.nextInt();

		if (total < 12) {
			System.out.println(" You ordered " + total + " eggs. That's " + total + " at 45 cents (" + total
					+ " x 45c = " + (total * 0.45) + ") for a total of $" + (total * 0.45));
		}

		else {
			dozen = total / 12;
			individual = total % 12;

			dozen_price = dozen * 3.25;
			individual_price = individual * 0.45;

			System.out.println("You ordered " + total + " eggs. That's " + dozen + " dozen (" + dozen + " x 12 = "
					+ (dozen * 12) + " eggs) at $3.25 per dozen (" + dozen + " x $3.25 = $" + dozen_price + ") and "
					+ individual + " loose eggs at 45 cents (" + individual + " x 45c = " + individual_price
					+ ") for a total of $" + (dozen_price + individual_price) + "($" + dozen_price + " + $"
					+ individual_price + " = $" + (dozen_price + individual_price) + ").");
		}

	}

}

//Shriyans Singh 114807762