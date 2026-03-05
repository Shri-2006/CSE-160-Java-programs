//Shriyans Singh 114807762
//d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//d = (radius*(Math.acos(Math.sin(Math.toRadians(x1))))*Math.sin(Math.toRadians(x2)))+(Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));

import java.util.Scanner;
import java.lang.Math;

public class GreatCircleDistance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1,y1,x2,y2;
		double radius = 6371.01;
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		x1 = Math.toRadians(input.nextDouble());
		y1= Math.toRadians(input.nextDouble());
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		x2 = Math.toRadians(input.nextDouble());
		y2= Math.toRadians(input.nextDouble());
		
		//double d = (radius*(Math.acos(Math.sin(Math.toRadians(x1))))*Math.sin(Math.toRadians(x2)))+(Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));
	/*	double radius_part = radius * Math.acos(Math.sin(x1))*Math.sin(x2);
		double second_multi= Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2);
		double d = radius_part+second_multi;
		//System.out.println("The distance between the two points is "+d);*/
		
		
	double d=	radius * Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		
		
		System.out.printf("The distance between the two points is %.6f km",d);
	
		input.close();
		
		
	}

}
