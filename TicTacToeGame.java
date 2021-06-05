package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	
	/**
	 * @description
	 * 
	 */
	static void createBoard() {
		System.out.println("TicTacToe game board");
		for(int i=1; i<board.length; i++) {
				board[i]= ' ';
			}
		}
public static void main(String args[]) {
		
		createBoard();
		
	}
}		
		
	
