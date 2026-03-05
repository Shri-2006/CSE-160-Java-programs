 
//Shriyans Singh 114807762
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		/*
		 * plan: first get the sides data. Then check if the sum of every pair of two
		 * edges is greater than reimaing edge.
		 */

		// This is getting the sides

		double A, B, C;

		System.out.print("Side1: ");
		Scanner a = new Scanner(System.in);
		A = a.nextDouble();
		// System.out.println(A);
		// a.close();

		System.out.println("Side2: ");
		Scanner b = new Scanner(System.in);
		B = b.nextDouble();
		// System.out.println(B);
		// b.close();

		System.out.println("Side3: ");
		Scanner c = new Scanner(System.in);
		C = c.nextDouble();
		// System.out.println(C);

		// c.close();

		{
			/*
			 * Then, check if all is equal. It would be equilateral If not all is equal,
			 * then check if 2 are different. Then use the last remaining side and && to
			 * check if all is different. (If it is all different, it is scalene). Else, it
			 * would be isosceles.
			 */

			if (A == B && B == C) {
				System.out.println(" Output: Equilateral");
			}

			else {
				if ((A + B >= C)) {
					if (B + C > A) {
						if (A + C >= B) {
							if (A != B) {
								if (B != C) {
									System.out.println("Output: Scalene");
								} else {
									System.out.println("Output: Isosceles");
								}
							} else {
								System.out.println("Output: Isosceles");
							}
						} else {
							System.out.println("Output: Isosceles");
						}

					} else {
						System.out.println("Output: Invalid input");
					}

				}

				else {
					System.out.println("Output: Invalid input");
				}
			}

			a.close();
			b.close();
			c.close();

		}

	}
}
