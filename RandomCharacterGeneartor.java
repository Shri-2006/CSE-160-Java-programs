
public class RandomCharacterGeneartor {
	char baseValue;
	int getRandomCharacter() {
		double randomValue=Math.random();
		
		int multiplied = (int)(randomValue*26);
		int remainder=(multiplied+multiplied)%26;
		
		return baseValue+remainder;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
