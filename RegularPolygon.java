//Shriyans Singh 114807762
//Area = n*(s^2) / (4 * tan(PI/n))
//Area = ((n * ( Math.pow(s, 2)))/(4*Math.tan(PI/n)));

import java.util.Scanner;
import java.lang.Math;

public class RegularPolygon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double PI = Math.PI;

		System.out.print("Enter the number of sides: ");
		double n = input.nextDouble();

		System.out.print("Enter the side length: ");
		double s = input.nextDouble();

		double area = ((n * (Math.pow(s, 2))) / (4 * Math.tan(PI / n)));
		System.out.println("The area of the polygon is " + area);
	}

}
