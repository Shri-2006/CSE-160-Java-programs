//Shriyans Singh 114807762
import java.util.Scanner;

public class LongestPrefixCommon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String first="";
		String second="";
		String res = "";
		System.out.print("Enter the first String: ");;
		first= input.nextLine();
		System.out.print("Enter the second string: ");
		second = input.nextLine();
		
		int len=Math.min(first.length(), second.length());

		for (int i = 0; i < len; i++) {
			if(first.charAt(i) != second.charAt(i) && res.equals("")) {
				break;
			}
			if(first.charAt(i) == second.charAt(i)) {
				res+=first.charAt(i);
			}
		}
		if(res.equals("")) {
			System.out.print(first+ " and "+second+" have no common prefix");
			
		}
		else {
			System.out.println("The common prefix is " + res);
		}
	}

}
