
//Shriyans Singh 114807762
import java.util.Scanner;


public class DistinctNumbers {
	public static boolean hasAlreadyBeenSeen(int currentIndex, int[] numberList) {
		for (int i=0; i<currentIndex; i++) {
			if (numberList[i] == numberList[currentIndex]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			int[] numbers = new int[10];
			System.out.print("Enter numbers: " );
			
			for (int i=0;i<10; i++) {
				numbers[i]=input.nextInt();
				
				if(i==0) {
					System.out.print("Unique numbers: ");
				}
				
				if( !hasAlreadyBeenSeen(i, numbers)) {
					System.out.print(numbers[i]+" ");
				}
			}
			input.close();
	}

}
