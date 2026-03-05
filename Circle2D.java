//Shriyans Singh 114807762
import java.lang.Math;
//import java.util.Scanner;
public class Circle2D {
	private double x,y,r;
	
	//(0,0) x and y and 1 radius
	public Circle2D() {
		this.x=0;
		this.y=0;
		this.r=1;
	}
	//x,y,radius inputted
	public Circle2D(double x, double y, double r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	//return values
	public double get_x() {
		return x;
	}
	public double get_y(){
		return y;
	}
	public double get_r() {
		return r;
	}
	
	//area
	public double getArea() {
		double area= (Math.PI*Math.pow(r, 2));
		return area;
				
	}
	public double getPerimeter() {
		double perimeter= (Math.PI*r*2);
		return perimeter;
	}
	
	public boolean contains(double x, double y) {
		double x_values=Math.pow(x-this.x, 2);
		double y_values=Math.pow(y-this.y, 2);
		double d=Math.sqrt(x_values+y_values);
		if (d<=r) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean contains (Circle2D circle) {
		double d_2=Math.pow(circle.get_x()-this.x, 2)+Math.pow(circle.get_y()-this.y, 2);
		double d= Math.sqrt(d_2);
		boolean res=false;
		if(d+circle.get_r()<=this.r) {
			res=true;
		}
		else {
			res=false;
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		Circle2D c1=new Circle2D(2,2,5.5);//This was where I messed up, I put the wrong number for one of the 2 lol
		System.out.printf("c1 Area = %.2f\nc1 Perimeter = %.2f\n", c1.getArea(),c1.getPerimeter());
		
	//	System.out.println(c1.contains(3,3));
		if(c1.contains(3,3)==true) {
			System.out.println("\n(3,3) is inside circle c1");
		}
		else {
			System.out.println("\n(3,3) is not within the circle c1");
		}
		//System.out.println(c1.contains(new Circle2D(4,5,10.5)));
		if(c1.contains (new Circle2D(4, 5, 10.5))==true) {
			System.out.println("\nNew circle is inside c1");
		}
		else {
			System.out.println("\nNew circle isn't inside c1");
		}
	}

}
