//Shriyans Singh ID: 114807762
import java.util.Scanner;

public class Celsius2Fahrenheit {
	public static void main(String[] args) {
		System.out.println("Enter degree in Celsius: ");
		Scanner input = new Scanner(System.in);
		double c = input.nextDouble();
		double f = ((9.0/5)*(c))+32;
		System.out.print(c +" in Celsius is "+ f + " in Farenheit");
		input.close();
	}
		
}
//Shriyans Singh ID: 114807762