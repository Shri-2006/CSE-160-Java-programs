//Shriyans Singh 114807762
import java.util.Scanner;
public class GCD {
	public static int calc(int x, int y) {
		while (y != 0) {
			int g = y;
			y=x%y;
			x=g;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int x = input.nextInt();
		System.out.print("Enter the second integer");
		int y = input.nextInt();
		
		int total = calc(x,y);
		System.out.println("The greatest common divisor is "+total);
		input.close();

	}

}
