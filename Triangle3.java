//Shriyans Singh 114807762
import java.lang.Math;//I named it Triangle3 because I already have some classes called Triangle
public class Triangle3 extends GeometricObject {
	private double side1,side2,side3;
	public Triangle3() {
		this.side1=1;
		this.side2=1;
		this.side3=1;
	}
	public Triangle3(double side1, double side2, double side3) throws IllegalTriangleException {
		super();
		if(side1+side2>=side3 || side1+side3>=side2 || side2+side3>=side1) {
			throw new IllegalTriangleException(side1,side2,side3);
		}
		
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
	}
	public Triangle3(double side1, double side2, double side3, String color, boolean filled)throws IllegalTriangleException {
		super(color, filled);
		if(side1+side2>=side3 || side1+side3>=side2 || side2+side3>=side1) {
			throw new IllegalTriangleException(side1,side2,side3);
		}
		
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double GetSide1(){
		return side1;
	}
	public double GetSide2(){
		return side2;
	}
	public double GetSide3(){
		return side3;
	}
	public double getArea(){
		double s=(side1+side2+side3)/2;
		double A=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return A;
	}
	public double getPerimeter(){
		double perimeter=side1+side2+side3;
		return perimeter;
	}
	public String toString() {
		String res = "The Triangle has side 1, side 2, and side3 (respectively) of "+ GetSide1()+", "+GetSide2()+", "+GetSide3()+" and an area of "+getArea()+" and a perimeter of "+getPerimeter()+super.toString();
		return res;
	}

	public static void main(String[] args) {
		/*try {
			Triangle3 triangle=new Triangle3(1,3,1);
		}catch (IllegalTriangleException e) {
			e.printStackTrace();
		}*/
		try{
			Triangle3 triangle= new Triangle3(1,1.5,1,"yellow",true);
		}catch (IllegalTriangleException e) {
			e.printStackTrace();		}
		
	//	System.out.println(triangle);

	}

}
