package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	static char turn;
	static String winner = null;
	static String line = null;
	static int userInput;

	/**
	 * Creating the game board
	 * 
	 */
	public static void createBoard() {
		System.out.println("TicTacToe game board");
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	/**
	 * taking input from user to choose the turn
	 */
	public static void chooseLetter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character X or O to choose the turn:");
		char turn = sc.next().charAt(0);
		if (turn == 'X' || turn == 'x') {
			System.out.println("Computer's turn to play the game");
			turn = 'O';
		} else if (turn == 'O' || turn == 'o') {
			System.out.println("Player's turn to play the game");
			turn = 'X';
		} else {
			System.out.println("Invalid input");
		}

	}

	/**
	 * Displaying the tictactoe game board
	 */
	public static void showBoard() {
<<<<<<< HEAD
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
		
	}
=======
	
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("|------------|");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("|------------|");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
>>>>>>> UC12_Till_Game_Over

	/**
	 * user is going to make a move to the desired location
	 */
	public static void checkMove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your slot number from 1 to 9: ");
		int userInput = sc.nextInt();
	}

	/**
	 * checking for the free spaces in the board
	 */
<<<<<<< HEAD
	public static void madeMove() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter your slot number from 1 to 9: ");
		int userInput = sc.nextInt();
		if(!(userInput > 0) && (userInput < 10)) {
		System.out.println("Invalid move, Re-enter the slot number:");
		continue;
		}else if(board[userInput] == ' '){
			board[userInput] = turn;
			showBoard();
			if(turn == 'X') {
				turn = 'O';
			}else {
				turn = 'X';
=======
	public static void madeMove(boolean firstPlayer) {
		Scanner sc = new Scanner(System.in);
		if (firstPlayer == true) {
			turn = 'X';
		} else {
			turn = 'O';
		}
		while (winner == null) {
			System.out.println("Enter your slot number from 1 to 9: ");
			if(turn=='O') userInput = sc.nextInt();
			else {
				Random random = new Random();
				userInput=random.nextInt(9)+1;
>>>>>>> UC12_Till_Game_Over
			}
			winnerCondition();
			if(turn == 'O') 
				userInput = blockOpponent(userInput);
			
			if (!(userInput > 0) && (userInput < 10)) {
				System.out.println("Invalid move, Re-enter the slot number:");
				continue;
			} 
			else if (board[userInput] == ' ') {
				board[userInput] = turn;
				showBoard();
				if (turn == 'X') {
					turn = 'O';
				} else {
					turn = 'X';
				}
				winner = checkWiningCombinations();

			} 
			else {
				System.out.println("Slot is taken already; Re-enter the slot number: ");
				showBoard();
				continue;
			}
		}

		if (winner.equals("tie")) {
			System.out.println("It's a tie| Thanks for playing");
		}
		else {
			System.out.println("Congratulations! " + winner + " has won.");
		}
		
	}

	/**
	 * Tossing the coin to check who plays first
	 */
	public static boolean tossToStartGame() {
		Random random = new Random();
		return random.nextBoolean();
	}

	/**
	 * Checking after move the winner or the tie or change in turn
	 */
	private static String checkWiningCombinations() {
		for (int a = 1; a < 9; a++) {

			switch (a) {
			case 1:{
				line = Character.toString(board[1] + board[2] + board[3]);
				break;}
			case 2:{
				line = Character.toString(board[4] + board[5] + board[6]);
				break;}
			case 3:{
				line = Character.toString(board[7] + board[8] + board[9]);
				break;}
			case 4:{
				line = Character.toString(board[1] + board[4] + board[7]);
				break;}
			case 5:{
				line = Character.toString(board[2] + board[5] + board[8]);
				break;}
			case 6:{
				line = Character.toString(board[3] + board[6] + board[9]);
				break;}
			case 7:{
				line = Character.toString(board[1] + board[5] + board[9]);
				break;}
			case 8:{
				line = Character.toString(board[3] + board[5] + board[7]);
				System.out.println("String is: " + line);
				break;}
			
			}
			if (line.equals("XXX")) {
				return "Computer";
			} else if (line.equals("OOO")) {
				return "Player";
			}
		}
		for (int i = 1; i < 10; i++) {
			if (board[i] == ' ') {
				break;
			} else if (i == 9)
				return "tie";

		}
		System.out.println(turn + "turn; enter a slot number to place the " + turn + " in: ");
		return null;

	}
<<<<<<< HEAD
=======

	/**
	 * checking for the win move
	 */
	private static void computerCheckToWin(int userInput) {
		board[userInput] = 'X';
	}

	/**
	 * @param userInput is taking the arguments of the row, column and diagonals
	 *                  Checking that opponent can win then can block it's win
	 */
	private static int blockOpponent(int userInput) {
		for (int a = 1; a < 9; a++) {
			String str;
			switch (a) {
			case 1: {
				str = Character.toString(board[1]) + Character.toString(board[2]) + Character.toString(board[3]);
				if (str == "XX") {
					for (int i = 1; i <= 3; i++) {
						if (board[i] == ' ') {
							turn = 'O';
							userInput = i;
							return userInput;
						}
					}
				}
				break;
			}

			case 2: {
				str = Character.toString(board[4]) + Character.toString(board[5]) + Character.toString(board[6]);
				if (str == "XX") {
					for (int i = 4; i <= 6; i++) {
						if (board[i] == ' ') {
							turn = 'O';
							userInput = i;
							return userInput;
						}
					}
				}
				break;
			}

			case 3: {
				str = Character.toString(board[7]) + Character.toString(board[8]) + Character.toString(board[9]);
				if (str == "XX") {
					for (int i = 7; i < 9; i++) {
						if (board[i] == ' ') {
							turn = 'O';
							userInput = i;
							return userInput;
						}
					}
				}
				break;
			}

			case 4: {
				str = Character.toString(board[1]) + Character.toString(board[4]) + Character.toString(board[7]);
				if (str == "XX") {
					for (int i = 1; i <= 7; i += 3) {
						if (board[i] == ' ') {
							turn = 'O';
							userInput = i;
							return userInput;
						}
					}
				}
				break;
			}

			case 5: {
				str = Character.toString(board[2]) + Character.toString(board[5]) + Character.toString(board[8]);
				if (str == "XX") {
					for (int i = 2; i <= 8; i += 3) {
						if (board[i] == ' ') {
							turn = 'O';
							userInput = i;
							return userInput;
						}
					}
				}
				break;
			}

			case 6: {
				str = Character.toString(board[3]) + Character.toString(board[6]) + Character.toString(board[9]);
				if (str == "XX") {
					for (int i = 3; i <= 9; i += 3) {
						if (board[i] == ' ') {
							turn = 'O';
							userInput = i;
							return userInput;
						}
					}
				}
				break;
			}

			case 7: {
				str = Character.toString(board[1]) + Character.toString(board[5]) + Character.toString(board[9]);
				if (str == "XX") {
					for (int i = 1; i <= 9; i += 4) {
						if (board[i] == ' ') {
							turn = 'O';
							userInput = i;
							return userInput;
						}
					}
				}
				break;
			}

			case 8: {
				str = Character.toString(board[3]) + Character.toString(board[5]) + Character.toString(board[7]);
				if (str == "XX") {
					for (int i = 3; i <= 7; i += 2) {
						if (board[i] == ' ') {
							turn = 'O';
							userInput = i;
							return userInput;
						}
					}
				}
				break;
				}
			}
		}
		return userInput;
	}

	/**
	 * If no one is winning then taking corner slots
	 * If corner slots are not available then taking the center slot
	 */
	private static void winnerCondition() {
		if (winner == null) {
			if (board[1] == ' ') {
				userInput = 1;
				return;
			} else if (board[3] == ' ') {
				userInput = 3;
				return;
			} else if (board[7] == ' ') {
				userInput = 7;
				return;
			} else if (board[9] == ' ') {
				userInput = 9;
				return;
			}
			else if(board[5] == ' ') {
					 userInput = 5;
					 return;
				 }
		} 
		else if (winner == "Player") {
			computerCheckToWin(userInput);
			winner = null;
		}
	}
	
>>>>>>> UC12_Till_Game_Over
	public static void main(String args[]) {

		while(true) {
		createBoard();
		chooseLetter();
		showBoard();
<<<<<<< HEAD
		madeMove()

	}
}
=======
		Boolean firstPlayer = tossToStartGame();
		madeMove(firstPlayer);
		}
		
	}
}

>>>>>>> UC12_Till_Game_Over
