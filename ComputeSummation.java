//Shriyans Singh 114807762
public class ComputeSummation {
	public static double calc(int n) {
		double sum =0;
		for (int i =1 ; i<=n; i++) {
			sum+=(double) i/(i+1);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.print("i           m(i)");
		for(int i = 1; i <=20;i++) {
			System.out.printf("\n%d         %.4f", i,calc(i));
			
			
			
			
			
			//System.out.println(i +"         "+calc(i));
		}

	}

}
