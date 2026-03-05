
//Shriyans Singh 114807762
import java.util.Scanner;

public class IsLeapYear {
	public static void main(String[] args) {
		System.out.println("Enter in a year: ");
		Scanner input = new Scanner(System.in);
		int year;
		year = input.nextInt();

		// if / 400 = true, leap year
		if (year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		}

		// if /400 = false but /100 = true it is not leap
		else if (year % 400 != 0 && year % 100 == 0) {
			System.out.println(year + " is not a leap year.");
		}

		// if only divisble by 4, it is leap //THIS IS THE BUGGY PART
		else if (year % 400 != 0 && year % 100 != 0) {
			if (year % 4 == 0) {
				System.out.println(year + " is a leap year");
			}

			else if (year % 4 != 0) {
				System.out.println(year + " is not a leap year.");
			}
		}

		// end program
		input.close();
	}

}
