package tictactoe;



public class TicTacToeGame {

	public static void main(String args[]) {
		System.out.println("TicTacToe game board");
	}

	
	public static void UC1() {
		char[][] board = new char[3][3];
		
		for(int i=1; i<=board.length; i++) {
			for(int j=1; j<=board[i].length; j++) {
				board[i][j]= " ";
			}
		}
		
	}
}
