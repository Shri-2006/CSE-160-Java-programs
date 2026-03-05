
//Shriyans Singh 114807762
import java.util.Scanner;

public class GasRefillCalculator {

	public static void main(String[] args) {
		System.out.print("Enter the distance: ");
		double distance;
		Scanner length = new Scanner(System.in);
		distance = length.nextDouble();

		System.out.print("Enter the mpg: ");
		double mpg;
		Scanner efi = new Scanner(System.in);
		mpg = efi.nextDouble();

		System.out.print("Enter the price: ");
		double price;
		Scanner cost = new Scanner(System.in);
		price = cost.nextDouble();

		double result = (distance / mpg) * price;

		System.out.println("Price for the trip: " + result);
		length.close();

	}

}
