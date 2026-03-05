//Shriyans Singh 114807762
import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = input.nextInt();
		input.close();
		//System.out.println();
		for(int i =1; i<=n;i++)
		{
			for(int rows= n; rows >i; rows--) {
				System.out.print("	");
			}
			
			int product =1;
			for (int j = 0; j <i;j++) {
				System.out.print(product+"	");
				product*=2;
			
			}
			product /= 2;
			for (int j = 1; j <i;j++) {
				product/=2;
				System.out.print(product+"	");
			}

			
			
			System.out.println();
		}
		
			

	}

}

