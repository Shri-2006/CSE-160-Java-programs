//Shriyans Singh 114807762
import java.lang.Math;
public class ApproximatePI {

	public static void main(String[] args) {
		for (int i = 10000; i <= 100000; i +=10000) {
			double pi=0;
			for(int j = 1; j <=i; j++) {
				pi+= Math.pow(-1, j+1)/(2*j -1);
			}
			System.out.println("i= "+ i + " PI appromiate: "+ 4*pi);
		}
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	int n=100000;
		for(int i=10000;i<=n; i+=10000) {
			System.out.println(factorial(i));
			
		double pi = 4*((1/factorial(i))); 
		System.out.println("i="+i+" PI approximate: "+pi);
		}
		
		
		

	}
	public static BigInteger factorial(int i) {
		
		BigInteger ori= new BigInteger("1");
		for (int k=2; k<=i;k++) 
			ori=ori.multiply(BigInteger.valueOf(k));
		return ori;
		
	}

}
*/