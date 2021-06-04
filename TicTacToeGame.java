package tictactoe;



public class TicTacToeGame {

	static char[][] board = new char[3][3];
	
	public static void UC1() {
		System.out.println("TicTacToe game board");
		for(int i=1; i<=board.length; i++) {
			for(int j=1; j<=board[i].length; j++) {
				board[i][j]= '-';
			}
		}
		
	}
	
}
