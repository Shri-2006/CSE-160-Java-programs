//Shriyans Singh 114807762

import java.util.Scanner;

public class PerfectNumber {
	public static boolean Checker(int n) {
		int total = 0;
		for (int i = 1; i<=(n/2);i++) {
			if(n%i==0) {
				total+=i;
			}
		}
		return n==total;
	}

	public static void main(String[] args) {
		int limit;
		Scanner input = new Scanner(System.in);
		System.out.print("Upper Limit: ");
		
		limit = input.nextInt();
		input.close();
		System.out.println("");
		
		System.out.print("the perfect numbers below " + limit + " are: ");
		for (int n = 2; n <= limit; n++) {
			if (Checker(n)) {
				System.out.print(n+ " ");
			}
		}

	}

}
