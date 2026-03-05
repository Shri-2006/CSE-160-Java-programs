//Shriyans SIngh 114807762

public class RandomMatrix {
	public static void checkColum(int[][] b) {
		for(int c = 0; c<8; c++) {
			boolean checkZ= true;
			boolean check0=true;
			for(int r = 0; r<8;r++) {
				if(b[r][c]==1) {
					checkZ= false;
					
				}
				if(b[r][c]==0) {
					check0= false;
				}
			}
			if(checkZ) {
				System.out.println("All 0 on column "+(c+1));
				
			}
			if(check0) {
				System.out.println("All 1 on column " + (c+1));
			}
		}
	}
	public static void checkRows(int[][] b) {
		for(int r = 0; r<8; r++) {
			boolean checkZ= true;
			boolean check0=true;
			for(int c = 0; c<8;c++) {
				if(b[r][c]==1) {
					checkZ= false;
					
				}
				if(b[r][c]==0) {
					check0= false;
				}
			}
			if(checkZ) {
				System.out.println("All 0 on row "+(r+1));
				
			}
			if(check0) {
				System.out.println("All 1 on row " + (r+1));
			}
		}
	}
	
	public static void checkMajor(int[][] b) {
		
		boolean checkZ= true;
		boolean check0 = true;
		for(int r = 0, c= 0; r<8;r++,c++) {
			if(b[r][c]==1) {
				checkZ=false;
			}
			if(b[r][c]==0) {
				check0=false;
			}
		}
		if(checkZ) {
			System.out.println("All 0 on the major diagnoal");
		}
		if(check0) {
			System.out.println("All 1 on the major diagnoal");

			
		}
		
	}
public static void checkMinor(int[][] b) {
		
		boolean checkZ= true;
		boolean check0 = true;
		for(int r = 7, c= 0; r>=0;r--,c++) {
			if(b[r][c]==1) {
				checkZ=false;
			}
			if(b[r][c]==0) {
				check0=false;
			}
		}
		if(checkZ) {
			System.out.println("All 0 on the minor diagnoal");
		}
		if(check0) {
			System.out.println("All 1 on the minor diagnoal");

			
		}
		
	}


	public static void printBoard(int[][] b) {
		for(int[] r: b) {
			for(int elem:r) {
				System.out.print(elem+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] board = new int[8][8];
		for(int r = 0;r<8;r++) {
			for (int c = 0; c <8; c++) {
				board[r][c] = (int)(Math.round(Math.random()));
				
				
			}
		}
		printBoard(board);
		checkRows(board);
		checkColum(board);
		checkMajor(board);
		checkMinor(board);

	}

}







