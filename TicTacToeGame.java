package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	
	/**
	 * Description of the board
	 * 
	 */
	public static void createBoard() {
		System.out.println("TicTacToe game board");
		for(int i=1; i<10; i++) {
				board[i]= ' ';
			}
		}
public static void main(String args[]) {
		
		createBoard();
		
	}
}		
		
	
