//Shriyans Singh 114807762
public class RandomString {
	public static String randomString(int len, char ulCase) {
		String res ="";
		if(ulCase =='u') {
			for(int i=0; i<len; i++) {
				res+=(char)(Math.random()*('Z'-'A'+1)+'A');
				
			}
		} else if(ulCase =='l') {
			for (int i=0; i<len; i++) {
				res += (char)(Math.random()*('z'-'a'+1)+'a');
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		String s1=randomString(4, 'u');
		String s2=randomString(8, 'l');
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
