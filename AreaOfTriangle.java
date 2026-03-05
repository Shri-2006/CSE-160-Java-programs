//Shriyans Singh 114807762
import java.util.Scanner;

public class AreaOfTriangle {
	
	public static double areaofTriangle(double base, double height) {
		return (0.5*base*height);
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the values of base and height: ");
		double base = input.nextDouble();
		double height = input.nextDouble();
		
		double area=areaofTriangle(base, height);
		System.out.println("Area of this triangle with base "+ base+ " and height " + height + " is: " +area);
		
		input.close();  							//This is so much easier to figure out how to write once I get a pseudo code up:D
	}

}
