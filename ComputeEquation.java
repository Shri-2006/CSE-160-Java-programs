
//Shriyans Singh 114807762
import java.util.Scanner;

public class ComputeEquation {

	public static void main(String[] args) {
		double x, y, z;
		System.out.print("Enter the first value: ");
		Scanner input = new Scanner(System.in);
		x = input.nextDouble();

		System.out.print("Enter the second value: ");
		Scanner value = new Scanner(System.in);
		y = value.nextDouble();

		z = ((x) / (y - (3 * x))) + ((x - 1) / (y / (x + 1)));
		System.out.println("Equation Value: " + z);

	}

}
