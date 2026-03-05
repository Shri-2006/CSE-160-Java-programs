//Shriyans Singh 114807762
import java.util.Scanner;
public class BinarytoDecimal {
	public static int bin2Dec(String binaryString) {//only thing that differs significantly from previous project is probably this method. Everything else should be relatively the same
		int result =0, length=binaryString.length();
		
		for(int i=0;i<length;i++) {
			char character = binaryString.charAt(i);					//I don't think I need to check if the binary is invalid since the instructions did not say so and I have to study for other classes ;(
			if(character=='1') {
				result+=Math.pow(2, (length-1-i));							//This took wayy to long to figure out, practice this before midterm
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter binary: ");
		String binaryString=input.nextLine();
		System.out.println("Decimal: "+bin2Dec(binaryString));
		input.close();

	}

}
