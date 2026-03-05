//Shriyans Singh 114807762
import java.lang.Math;
import java.util.Scanner;
public class Interests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan amount: ");
		double loanAmount=input.nextDouble();
		System.out.print("Number of Years: " );
		double numberOfYears = input.nextDouble();
		
		for(double i = 5; i <=8; i+=0.125) {
			double annualInterestRate = i;
			
			
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 -(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			System.out.printf("%.3f%%  %.2f  %.2f\n", annualInterestRate, monthlyPayment, totalPayment);
			
		}
	}

}
