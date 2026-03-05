
//Shriyans Singh 114807762
import java.util.Scanner;

public class PopulationEstimates {

	public static void main(String[] args) {
		System.out.print("Enter a Year: ");
		int year_big, year, pop;
		Scanner input = new Scanner(System.in);
		year_big = input.nextInt();
		year = year_big % 100;

		pop = (((year - 10) * 3) + 310);
		System.out.println("Population Estimate (millions of people): " + pop);

	}

}
//Shriyans Singh 114807762
