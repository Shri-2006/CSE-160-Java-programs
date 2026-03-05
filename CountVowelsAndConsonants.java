//Shriyans Singh 114807762
import java.util.Scanner;
public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input="";
		int vCount=0,cCount=0;
		char[] vowels= {'a', 'e', 'i', 'o', 'u'};
		System.out.print("Enter a string: ");
		input=sc.nextLine();
		sc.close();
		
		for ( int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				continue;
			}
			for(char v: vowels) {
				if(input.charAt(i) == v) {
					vCount++;
				}
			}
			cCount++;
			
		}
		cCount-=vCount;
		System.out.println("The number of vowels is " + vCount);
		System.out.println("The number of consonants is "+ cCount);
	}

}
