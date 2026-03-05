//Shriyans Singh 114807762
import java.util.Scanner;
public class DecimalToBinary {
	public static String dec2Bin(int value) {
		String result="";
		if(value==0) {
			result = "0";
			return result;
		}
		do {
			result=(value%2)+result;
			value/=2;
			
		}while(value>0);
		return result;
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Decimal: ");
		int value = input.nextInt();
		System.out.println("Binary: "+dec2Bin(value)); //I am pretty sure the _2 is a mistake in piazza because the number 10 is 1010, not (1010)_2
		input.close(); 

	}

}																															//FIRST TRY IT WORKED YAY
