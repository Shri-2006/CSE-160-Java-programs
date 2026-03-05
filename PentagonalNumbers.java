
//Shriyans Singh 114807762
import java.util.Scanner;

public class PentagonalNumbers {

	public static void main(String[] args) {
		int n, p;
		System.out.print("Enter n:  ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();

		p = (n * ((3 * n) - 1) / 2);
		System.out.println("Pentagonal number: " + p);
	}

}
