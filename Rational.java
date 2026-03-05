//Shriyans Singh 114807762
import java.util.Scanner;
import java.lang.Math;
public class Rational {
	private int num,den;
	public Rational() {
		this.num=0;
		this.num=1;
	}
	
	public Rational(int num, int den) {
		//no den=0
		if(den==0) {
			den+=1;
			System.out.println("ERROR IS OCCURING BECAUSE DENOMINATOR IS EQUAL TO 0. THIS ISN'T POSSIBLE ");
		}
		int gcd=GCD(Math.abs(num),Math.abs(den));
		this.num=num/gcd;
		this.den=den/gcd;//took me wayy too long to realize i should divide by gcd...make sure to read the directions better
		
	}
	private static int GCD(int num, int den) {
		while((den!=0)) {
			int temp=den;
			den=num%den;
			num=temp;
		}
		return num;
	}
	public static Rational add(Rational r1, Rational r2) {
		int num=(r1.num*r2.den)+(r1.den*r2.num);//this was wrong before because fractions. When you add numerators, you need to make sure the denominators are the same
		int den=(r1.den*r2.den);
		return new Rational(num,den);
	}
	public static Rational subtract(Rational r1, Rational r2) {
		int num=(r1.num*r2.den)-(r1.den*r2.num);
		int den=r1.den*r2.den;
		return new Rational(num,den);

	}
	public static Rational multiply(Rational r1, Rational r2) {
		int num=(r1.num*r2.num);
		int den=(r1.den*r2.den);
		return new Rational(num,den);
	}
	public static Rational divide(Rational r1, Rational r2) {
		if(r2.num==0) {
			System.out.println("This is an invalid prompt because if the numerator of the second fraction is 0, it will not work");
			int num=0;
			int den=0;
			return new Rational(num,den);
		}
		else {
			int num=(r1.num*r2.den);
			int den=(r1.den*r2.num);
			return new Rational(num,den);
		}
		//return new Rational(num,den);
	}
	public void print() {
		System.out.printf("%d/%d",this.num,this.den);
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter numerator for the first rational number: ");
		int num1=input.nextInt();
		System.out.print("\nEnter a nonzero denominator for the first rational number: ");
		int den1=input.nextInt();
		System.out.print("\nEnter numerator for the second rational number: ");
		int num2=input.nextInt();
		System.out.print("\nEnter a non-zero denominator for the second rational number: ");
		int den2=input.nextInt();
		
		
		Rational res1= new Rational(num1,den1);
		Rational res2= new Rational(num2,den2);
		System.out.print("First rational Number is: ");
		res1.print();
		System.out.print("\nSecond rational number is: ");
		res2.print();
		System.out.print("\nAdding rational numbers is: ");
		Rational.add(res1,res2).print();
		System.out.print("\nSubtracting the rational numbers lead to: ");
		Rational.subtract(res1, res2).print();
		System.out.print("\nMultiplying the rational numbers is: ");
		Rational.multiply(res1, res2).print();
		System.out.print("\nDividing the rational numbers is: ");
		Rational.divide(res1, res2).print();

	}
	

}






