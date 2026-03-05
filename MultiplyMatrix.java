//Shriyans Singh 114807762
import java.util.Scanner;

public class MultiplyMatrix {
	public static double[][] multiplyMatrix(double [][] a,double[][] b){
		
		int rowlength=3;// b.length;
		int n=3;//a[0].length;
		double[][] c=new double[n][rowlength];
		
		for(int i = 0; i<n;i++) {
			for (int j=0;j<3;j++) {
				for(int m=0;m<n;m++) {
					c[i][j]+=(a[i][m]*b[m][j]);
				}
			}
		}
		return c;
		

		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[][]a = new double[3][3];
		double[][]b = new double [3][3];
		System.out.println("Enter Matrix 1: ");
		for(int n=0;n<3;n++) {
			for(int m=0;m<3;m++) {
				a[n][m]=input.nextDouble();
				
			}
		}
		
		System.out.println("Enter Matrix 2: ");
		for(int n=0;n<3;n++) {
			for(int m=0;m<3;m++) {
				b[n][m]=input.nextDouble();
				
			}
		}
		double[][] C= multiplyMatrix( a, b);
		
		System.out.println("Multiplication of the matrices are: ");
		for(int n=0; n<3;n++) {
			for(int m=0; m<3;m++) {
				System.out.printf("%.1f  ",C[n][m]);
			}
			System.out.println();
		}
		
		

	}

}
