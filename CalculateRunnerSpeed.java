
//Shriyans Singh 114807762
import java.util.Scanner;

public class CalculateRunnerSpeed {

	public static void main(String[] args) {
		System.out.print("Input the Distance in miles: ");
		Scanner miles = new Scanner(System.in);
		double distance = miles.nextDouble();

		System.out.print("Input the time in Minutes: ");
		Scanner min = new Scanner(System.in);
		double time = min.nextDouble();
		time = time / 60;

		double speed = distance / time;
		System.out.println("Speed: " + speed);

		miles.close();

	}

}
