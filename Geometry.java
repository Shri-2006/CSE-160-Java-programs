//Shriyans Singh 114807762
import java.util.Scanner;
import java.lang.Math;

public class Geometry {
	public static double getTriangleArea(double[][] points) {
		double res=0;
		double asquare= Math.pow((points[1][0]-points[0][0]), 2)+Math.pow((points[1][1]-points[0][1]), 2);
		double a=Math.sqrt(asquare);
		
		double bsquare= Math.pow((points[2][0]-points[0][0]), 2)+Math.pow((points[2][1]-points[0][1]), 2);
		double b= Math.sqrt(bsquare);
		
		double csquare= Math.pow((points[2][0]-points[1][0]), 2)+Math.pow((points[2][1]-points[1][1]), 2);
		double c = Math.sqrt(csquare);
		
		double s= (0.5)*(a+b+c);
		double sameline= (points[0][0]*(points[1][1]-points[2][1]) +points[1][0]*(points[2][1]-points[0][1])+ points[2][0]*(points[0][1]-points[1][1]));
		
		if (sameline==0) {
			res=0;
		}
		else {
			res=Math.sqrt((s)*(s-a)*(s-b)*(s-c));
			
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points=new double[3][3];

		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		for (int i =0;i<3;i++) {
			for(int g=0;g<2;g++) {
				points[i][g]=input.nextDouble();
			}
		}
		input.close();
		
		if (getTriangleArea(points)==0) {
			System.out.print("The three points are on the same line.");
		}
		else {
			System.out.printf("The area of the triangle is %.2f", getTriangleArea(points));
		}
		
		
	}

}





















/*//Shriyans Singh 114807762
import java.util.Scanner;
import java.lang.Math;

public class Geometry {
	public static double getTriangleArea(double[][] points) {
		double res=0;
		double asquare= Math.pow((points[1][1]-points[0][0]), 2)+Math.pow((points[1][2]-points[0][1]), 2);
		double a=Math.sqrt(asquare);
		
		double bsquare= Math.pow((points[2][2]-points[0][0]), 2)+Math.pow((points[2][3]-points[0][1]), 2);
		double b= Math.sqrt(bsquare);
		
		double csquare= Math.pow((points[2][2]-points[1][1]), 2)+Math.pow((points[2][3]-points[1][2]), 2);
		double c = Math.sqrt(csquare);
		
		double s= (0.5)*(a+b+c);
		
		
		if (points[0][0]==points[1][1]&&points[1][1]==points[2][2]&&points[0][1]==points[1][2]&&points[1][2]==points[2][3]) {
			res=0;
		}
		else {
			res=Math.sqrt((s)*(s-1)*(s-b)*(s-c));
			
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points=new double[3][3];

		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		for (int i =0;i<3;i++) {
			for(int g=0;g<3;g++) {
				points[i][g]=input.nextDouble();
			}
		}
		input.close();
		
		if (getTriangleArea(points)==0) {
			System.out.print("The three points are on the same line.");
		}
		else {
			System.out.printf("The area of the triangle is %.2f", getTriangleArea(points));
		}
		
		
	}

}
*/