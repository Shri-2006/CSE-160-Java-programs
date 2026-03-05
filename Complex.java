//Shriyans Singh 114807762
import java.util.Scanner;
public class Complex {
	private double realPart,imaginaryPart;
	
	public Complex(double r, double i) {
		this.realPart=r;
		this.imaginaryPart= i;
	}
	
	public Complex() {
		this.realPart=0;
		this.imaginaryPart=0;//default is 0 right?
	}
	public static Complex add(Complex c1, Complex c2) {
		double r_total=c1.realPart+c2.realPart;
		double i_total=c1.imaginaryPart+c2.imaginaryPart;
		return new Complex(r_total, i_total);
	}
	public static Complex subtract(Complex c1, Complex c2) {
		double r_difference=c1.realPart-c2.realPart;
		double i_difference=c1.imaginaryPart-c2.imaginaryPart;
		return new Complex(r_difference, i_difference);
	}
	
	public void print() {
		System.out.printf("(%.1f, %.1f)", realPart,imaginaryPart);
	}
	
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter real part of the first complex number: ");
		double r1=input.nextDouble();
		System.out.print("\nEnter imaginary part of the first complex number: ");
		double i1=input.nextDouble();
		System.out.print("\nEnter real part of the second complex number: ");
		double r2=input.nextDouble();
		System.out.print("\nEnter imaginary part of the second complex number: ");
		double i2=input.nextDouble();
		
		System.out.print("First complex number is: ");
		Complex c1 = new Complex(r1,i1);
		Complex c2=new Complex(r2,i2);//I decided to just make a new variable instead of repeatedly writing it
		Complex total=Complex.add(c1, c2);
		Complex diff=Complex.subtract(c1, c2);
		input.close();
		c1.print();
		System.out.print("\nSecond complex number is: ");
		c2.print();
		
		System.out.print("\naddition of the complex numbers is: ");
		total.print();
		
		System.out.print("\nSubtraction of the complex numbers is: ");
		diff.print();
		
		

	}

}
