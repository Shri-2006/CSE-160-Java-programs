
//Shriyans Singh 114807762
import java.util.Scanner;

public class Gasoline {

	public static void main(String[] args) {
		double min, speed, mpg;
		System.out.println("Enter the Number of minutes: ");
		Scanner time = new Scanner(System.in);
		min = time.nextDouble();
		double hour = min / 60;

		System.out.println("Enter the constant speed of the car (m/h): ");
		Scanner spe = new Scanner(System.in);
		speed = spe.nextDouble();

		System.out.println("Enter the fuel efficiency(mpg):  ");
		Scanner milespergallon = new Scanner(System.in);
		mpg = milespergallon.nextDouble();

		double gallons_consumed = ((hour * speed) / mpg);
		System.out.println("Consumed gas for the period (in gallons): " + gallons_consumed);

		time.close();
		milespergallon.close();
		spe.close();

	}

}
