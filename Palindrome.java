//Shriyans Singh 114807762
import java.util.Scanner;
public class Palindrome {
	public static boolean checker(String User_input) {
		String lowered=User_input.toLowerCase();
		String cleaned = lowered.replaceAll(" ", "");
		int l = 0;
		int r=(cleaned.length()-1);
		
		do {
			if (cleaned.charAt(l)!=cleaned.charAt(r)){
				return false;
			}
			r--;
			l++;
		}while(l<r);
		return true;
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter input: " );
		String line = input.nextLine(); //Why does input.next() not work?!
		
		if(checker(line)==true) {
			System.out.println("Input string "+ line+" is a palindrome");
		}
		else {
			System.out.println("Input string "+ line+ " is not a palindorme.");
		}
		input.close();				//Adding this finally fixed the "terminate" error I was getting...

	}

}
