
//Shriyans Singh 114807762
import java.util.Scanner;

public class CarInsurance {

	public static void main(String[] args) {
		Scanner stuff = new Scanner(System.in);
		System.out.print("Please enter in the premium price of the auto insurance policy: ");
		double premium = stuff.nextDouble();
		System.out.print("Please enter in the person's age: ");

		int age = stuff.nextInt();
		stuff.nextLine();
		System.out.print("Please enter in either Male or Female for gender: ");
		String gender = stuff.nextLine();
		stuff.close();

		if (age >= 18 && age < 21 && gender.equals("Male")) {
			premium *= 1;
		} else if (age >= 18 && age < 21 && gender.equals("Female")) {
			premium *= 0.9;
		}

		else if (age >= 21 && age < 30) {
			premium *= 0.75;

		}

		else if (age >= 30 && age < 60 && gender.equals(("Male"))) {
			premium *= 0.6;
		} else if (age >= 30 && age < 60 && gender.equals((("Female")))) {
			premium *= .7;
		} else if (age >= 60) {
			premium *= 1;
		} else {
			premium *= 0;
			premium = 1;
		}

		System.out.println("Premium: " + premium);

	}

}
