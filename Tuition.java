//Shriyans Singh 114807762

public class Tuition {

	public static void main(String[] args) {
		double tuition = 10000;
		
		for(int i = 0; i < 10; i++) {
			tuition *= 1.05;
		}
		System.out.printf("Tuition after 10 years: $%.2f\n",tuition);
		
		double total = 0;
		for(int j = 0; j<4; j++) {
			total += tuition;
			tuition *= 1.05;
		}
		System.out.printf("Total tuition for 4 years (after 10 years): $%.2f\n", total);
	}
}

/*public class Tuition {

	public static void main(String[] args) {
		int ori= 10000;
		int after10= ori;
		for(int i=0;i<10;i++) {
			after10*=1.05;
		}
		System.out.printf("Tuition in 10 years is $%d",after10);
		//int after14 =after10;
		
		int one=(int) (after10*1.05);
		int two = (int) (one *1.05);
		int three = (int) (two*1.05);
		int four=(int)(three*1.05);
		
		int after14= one+two+three+four;
		
		
		/*for(int j=0;j<4;j++) {
			after14*=1.05;
		}
		
		
	System.out.printf("\nTuition of 4 years after the 10th year is  $%d",after14);

}

} 
 */