//Shriyans Singh 114807762
import java.util.Scanner;
public class SumColumns {
	public static double sumColumn(double [][] m, int c) {
		double sum = 0 ;
		for(double[] r:m) {
			sum+=r[c];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the dimensions of a nxm  matrix: ");
		int n = input.nextInt();
		int m= input.nextInt();
		
		double [][] matrix = new double[n][m];
		
		System.out.printf("Enter the matrix of %d x %d",n,m);
		for(int r = 0; r<n;r++) {
			for(int c = 0; c<m; c++) {
				matrix[r][c]=input.nextDouble();
			}
		}
		input.close();
		System.out.println("The sums of the columns are: ");
		for(int i = 0 ; i < m; i++) {
			System.out.print(sumColumn(matrix, i)+" ");
		}
		
	}

}
