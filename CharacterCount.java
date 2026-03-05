
//Shriyans Singh 114807762
import java.util.Scanner;

public class CharacterCount {
	public static int counter(String user_input, char character) {
		int counter = 0;
		for (int i = 0; i < user_input.length(); i++) {
			if (user_input.charAt(i) == character) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String user_input = input.next();
		System.out.print("Enter character to count: ");
		char character = input.next().charAt(0);

		System.out.println(
				"The character " + character + " appears " + counter(user_input, character) + " times in the string");
		input.close();

	}

}
