//Shriyans Singh 114807762
import java.util.Scanner;

public class Anagram {
	public static boolean check(String first, String second) {
		first=first.toLowerCase();
		second=second.toLowerCase();
		
		first=first.replaceAll(" ", "");
		second = second.replaceAll(" ", ""); 								//from stackoverflow:D
		
		if (first.length()!=second.length()){
			return false;
		}
		int[] character1=new int[26];
		int [] character2=new int[26];
		for(int i=0;i<first.length();i++) {
			character1[first.charAt(i)-'a']++;//I think this should work, and just copy and paste it to the second one.
		}
		for(int i=0;i<second.length();i++) {
			character2[second.charAt(i)-'a']++;
		}
		for(int i=0; i<26;i++) {
			if(character1[i]!=character2[i]) { 																										//originally I tried having it say true if the characters did match, but that didn't work. IDK why doing the opposite way works but this doesn't but I am not messing with this anymore
				return false;
			}
		}
		return true;
																																		//This should work...probably
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the firsst string: ");
		String first = input.nextLine();
		System.out.print("Enter the second string: ");
		String second = input.nextLine();
		
		if(check(first,second)==true) {
			System.out.println(first+ " and "+second+" are anagrams");
		}
		else {
			System.out.println(first+ " and "+second+" are not anagrams");
		}

	}

}
