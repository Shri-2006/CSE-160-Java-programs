//Shriyans Singh 114807762
import java.util.Scanner;
public class SortRows {
	public static double[][] sortRows(double[][] m){
		for (double[] row:m) {
			bubblesort(row);
		}
		return m;
	}
	public static void bubblesort(double[] row) {
		boolean changed = true;
		do {
			changed = false;
			for ( int j = 0; j<row.length-1;j++) {
				if(row[j]>row[j+1]) {
					changed = true;
					double temp = row[j];
					row[j]=row[j+1];
					row[j+1]=temp;
				}
			}
		}while(changed);
	}
	public static void displayMatrix(double[][] m) {
		for(double[] row: m) {
			for(double elem: row) {
				System.out.print(elem+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] m = new double[3][3];
		System.out.println("Enter a 3 by 3 matrix row by row: ");
		for(int r = 0; r<3;r++) {
			for(int c=0; c<3;c++) {
				m[r][c]=input.nextDouble();
				
			}
		}
		input.close();
		System.out.println("The row sorted matrix is: ");
		displayMatrix(sortRows(m));
		
	}

}
