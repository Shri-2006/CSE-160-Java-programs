//Shriyans Singh 114807762
import java.util.Scanner;
public class TicTacToe {
	
	public static boolean checkRows(char[][] board, char piece) {
		boolean checker;
		for(int r= 0; r<3;r++) {
			checker=true;
			for(int c=0;c<3;c++) {
				if(board[r][c]!=piece) {
					checker=false;
				}
				
				
			}
			if(checker) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkCols(char[][] board, char piece) {
		boolean checker;
		for(int c = 0; c<3;c++) {
			checker=true;
			for(int r = 0; r<3;r++) {
				if(board[r][c]!= piece) {
					checker = false;
				}
			}
			if(checker) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkMinorDiag(char[][]board,char piece) {
		for(int i =0; i<3;i++) {
			if(board[i][3-i-1]!=piece) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkMajorDiag(char[][]board,char piece) {
		for(int i=0; i <3;i++) {
			if(board[i][i]!=piece) {
				return false;
			}
		}
		return true;
	}
	
	public static void printBoard(char[][] board) {
		for(char[] r: board) {
			for(char c:r) {
				System.out.print(c+ " ");
				
			}
			System.out.println("");
		}
	}
	

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
				
			}
		}
		int counter = 0;
		int row, col;
		char piece;
		Scanner input= new Scanner(System.in);
				
		do {
			piece= (counter%2==0)?'X':'0';
			while(true) {
				System.out.println("player " + ((piece == 'X')?"One":"Two")+": ");
				row=input.nextInt();
				col=input.nextInt();
				
				if(row>3 || row<1 || col<1 || row>3) {
					System.out.println("Out of bounds");
				}
				else if(board[row-1][col-1]!= '-') {
					System.out.println("Position already occupied");
				}
				else {
					break;
				}
			}
			board[row-1][col-1]=piece;
			
			if(checkRows(board, piece) || checkCols(board,piece)||checkMinorDiag(board,piece)||checkMajorDiag(board,piece)) {
				System.out.println("Player " + ((piece == 'X')? "One":"Two")+" has won!");
				printBoard(board);
				input.close();
				return;
				
			}
			else if(counter == 8) {
				System.out.println("Draw");
				printBoard(board);
				input.close();
				return;
			}
			else {
				System.out.println("unfinished");
				printBoard(board);
				System.out.println();
				
			}
			counter++;
			
			
			
			
		}while(counter<9);
		input.close();

	}

}
