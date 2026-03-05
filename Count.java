
//Shriyans Singh 114807762
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, value, count = 0, pos = 0, neg = 0, total = 0;
		float avg = 0;
		System.out.print("Enter numbers: ");

		while ((num = input.nextInt()) != 0) {
			total += num;

			count++;

			if (num > 0) {
				pos++;
			} else {
				neg++;
			}
		}
		input.close();
		avg = total / (float) count;
		System.out.println("Number of positive numbers: " + pos);
		System.out.println("Number of negative numbers: " + neg);
		System.out.println("Number of total: " + total);
		System.out.println("Average: " + avg);
	}

}
