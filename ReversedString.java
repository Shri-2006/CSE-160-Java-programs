
//Shriyans Singh 114807762
import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.next();
		int length = string.length();

		for (length = string.length() - 1; length > -1; length--) {
			char finalcharacter = string.charAt(length);
			System.out.print(finalcharacter);
		}
		input.close();

	}

}
