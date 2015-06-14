package ba.bitcamp.TicTacToe.game.gordan.masic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		/*
		 * >>>>>>>>>>>> GAME OF TIC TAC TOE <<<<<<<<<<<<<<
		 */
		Scanner in = new Scanner(System.in);

		int counterWonX = 0;
		int counterWonO = 0;
		int counterDraw = 0;
		int gamesPlayed = 0;

		String[][] fieldXO = null;
		int sizeField = 0;

		int num = 0;
		do {
			while (true) {
				try {
					// INSERT SIZE OF FIELD
					System.out
							.print("Insert size of field (e.g. 3 for 3 X 3 field) : ");
					sizeField = in.nextInt();
					System.out.println();

					// CREATING FIELD
					fieldXO = ticTacToe(sizeField);
					print2DArray(fieldXO, 2 * sizeField);
					System.out.println();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Size of field must be number!");
					System.out.println("Please try again.");
					System.out.println();
					in.nextLine();
				}
			}
			gamesPlayed++;
			// STARTING GAME
			String[][] game = fieldXO;
			int counterX = 0;
			while (true) {

				// PAYER X MOVE
				game = userPlayX(fieldXO);
				System.out.println();
				print2DArray(game, 2 * sizeField);
				System.out.println();

				// CHECKING IF PLAYER X IS WINNER
				boolean doneX = checkX(game);
				if (doneX == true) {
					counterWonX++;
					break;
				}

				// COUNTING PLAYER X MOVES
				counterX++;

				// CHECKING IS DRAW GAME
				if (counterX > game.length / 2 + 1) {
					System.out.println("DRAW!");
					counterDraw++;
					break;
				}

				// PLAYER O MOVE
				game = userPlayO(fieldXO);
				System.out.println();
				print2DArray(game, 2 * sizeField);
				System.out.println();

				// CHECKING IS PLAYER O WINNER
				boolean doneO = checkO(game);
				if (doneO == true) {
					counterWonO++;
					break;
				}

			}

			// Asking user if he wants to play again
			System.out.println("If you want to play again input number 1");
			System.out.println("If you want to end game input number 0");
			num = in.nextInt();
		} while (num == 1);
		in.close();

		// Putting how many times user played game and
		// which scores he made
		TextIO.writeFile("src/ScoreTicTacToe.txt");
		TextIO.putln("SCORES OF TIC TAC TOE GAME");
		TextIO.putln();
		TextIO.putln("Games played: " + gamesPlayed);
		TextIO.putln();
		TextIO.putln("Player X has won: " + counterWonX + " times");
		TextIO.putln();
		TextIO.putln("Player O has won: " + counterWonO + " times");
		TextIO.putln();
		TextIO.putln("Game was draw " + counterDraw + " times");
		TextIO.writeStandardOutput();

	}

	/**
	 * Creates field for playing Tic Tac Toe
	 * 
	 * @param sizeField
	 *            dimension of the field to play
	 * @return field with dimensions sizeField X sizeField
	 * 
	 * @throws InputMismatchException
	 */
	public static String[][] ticTacToe(int sizeField) {

		String[][] field = new String[2 * sizeField][2 * sizeField];
		for (int i = 0; i < field.length; i++) {
			for (int j = 1; j < field.length; j += 2) {
				field[j][i] = "-";
				field[i][j] = "|";

			}
		}
		int z = 1;
		for (int i = 0; i < field.length; i += 2) {
			for (int j = 0; j < field.length; j += 2) {
				field[i][j] = "" + z++;
			}

		}

		for (int i = 1; i < field.length; i += 2) {
			for (int j = 0; j < field.length; j++) {
				field[j][i] = "|";

			}

		}
		return field;

	}

	/**
	 * Prints 2D matrix
	 * 
	 * @param array
	 *            - matrix we want to print
	 * @param column
	 *            - number of columns in matrix
	 * 
	 * @throws InputMismatchException
	 */
	public static void print2DArray(String[][] array, int column) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");

				if (j == column - 1) {
					System.out.print("\n");
				}
			}
		}
	}

	/**
	 * PlayerX moves
	 * 
	 * @param array
	 *            game field
	 * @return game field with X move
	 */
	public static String[][] userPlayX(String[][] array) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while (true) {

			System.out.println("Player X is on the move!");
			System.out.print("Input number of field: ");
			String num = in.next();
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j].equals(num)) {
						array[i][j] = "X";
					}
				}
			}

			break;
		}
		return array;
	}

	/**
	 * PlayerO moves
	 * 
	 * @param array
	 *            game field
	 * @return game field with O move
	 */
	public static String[][] userPlayO(String[][] array) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Player O is on the move!");
			System.out.print("Input field number: ");
			String x = in.next();
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j].equals(x))
						array[i][j] = "O";
				}
			}

			break;

		}
		return array;
	}

	/**
	 * One row of game field checking for all X
	 * 
	 * @param array
	 *            game field
	 * @param row
	 *            which row is checking out
	 * @return boolean
	 */
	public static boolean checkOutRowForX(String[][] array, int row) {
		int counter = 0;
		for (int i = 0; i < array.length; i += 2) {
			if (array[row][i].equals("X")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * All rows checking for all X using method checkOutRowForX
	 * 
	 * @param array
	 *            game field
	 * 
	 * @return boolean
	 */
	public static boolean isAllXRow(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (checkOutRowForX(array, i) == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * One row of game field checking for all O
	 * 
	 * @param array
	 *            game field
	 * @param row
	 *            which row is checking out
	 * @return boolean
	 */
	public static boolean checkOutRowForO(String[][] array, int row) {
		int counter = 0;
		for (int i = 0; i < array.length; i += 2) {
			if (array[row][i].equals("O")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * All rows checking for all O using method checkOutRowForO
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean isAllORow(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (checkOutRowForO(array, i) == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * One column checking for all X
	 * 
	 * @param array
	 *            game field
	 * @param column
	 *            which column is checking out
	 * @return boolean
	 */
	public static boolean checkOutColumnForX(String[][] array, int column) {
		int counter = 0;
		for (int i = 0; i < array.length; i += 2) {
			if (array[i][column].equals("X")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * All columns checking for all X using method checkOutColumnForX
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean isAllXColumn(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (checkOutColumnForX(array, i) == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * One column checking for all O
	 * 
	 * @param array
	 *            game field
	 * @param column
	 *            which column is checking out
	 * @return boolean
	 */
	public static boolean checkOutColumnForO(String[][] array, int column) {
		int counter = 0;
		for (int i = 0; i < array.length; i += 2) {
			if (array[i][column].equals("O")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * All columns checking for all O using method checkOutColumnForO
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean isAllOColumn(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (checkOutColumnForO(array, i) == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checking if the main diagonal has all X
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean isMainDiagonalX(String[][] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i += 2) {
			if (array[i][i].equals("X")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checking if the main diagonal has all O
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean isMainDiagonalO(String[][] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i += 2) {
			if (array[i][i].equals("O")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checking if the side diagonal has all X
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean isSideDiagonalX(String[][] array) {
		int counter = 0;
		int i = 0;
		int j = array.length - 2;
		do {
			if (array[i][j].equals("X")) {
				counter++;
			}
			i += 2;
			j -= 2;
		} while (i <= array.length - 2 && j >= 0);
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checking if the side diagonal has all O
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean isSideDiagonalO(String[][] array) {
		int counter = 0;
		int i = 0;
		int j = array.length - 2;
		do {
			if (array[i][j].equals("O")) {
				counter++;
			}
			i += 2;
			j -= 2;
		} while (i <= array.length - 2 && j >= 0);
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks all rows and all columns for all X using methods isAllXRow and
	 * isAllXColumn
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean checkRowsAndColumnsX(String[][] array) {
		boolean doneXrow = isAllXRow(array);
		if (doneXrow == true) {
			System.out.println("Winner is player X!");
			return true;
		}

		boolean doneXcolumn = isAllXColumn(array);
		if (doneXcolumn == true) {
			System.out.println("Winner is player X!");
			return true;
		}

		return false;
	}

	/**
	 * Checks all rows and all columns for all O using methods isAllORow and
	 * isAllOColumn
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean checkRowsAndColumnsO(String[][] array) {
		boolean doneOrow = isAllORow(array);
		if (doneOrow == true) {
			System.out.println("Winner is player O!");
			return true;
		}

		boolean doneOcolumn = isAllOColumn(array);
		if (doneOcolumn == true) {
			System.out.println("Winner is player O!");
			return true;
		}

		return false;
	}

	/**
	 * Checks both diagonals for all X using methods doneXmainDiagonal and
	 * doneXSideDiagonal
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean checkDiagonalsX(String[][] array) {
		boolean doneXMainDiagonal = isMainDiagonalX(array);
		if (doneXMainDiagonal == true) {
			System.out.println("Winner is player X!");
			return true;
		}

		boolean doneXSideDiagonal = isSideDiagonalX(array);
		if (doneXSideDiagonal == true) {
			System.out.println("Winner is player X!");
			return true;
		}

		return false;
	}

	/**
	 * Checks both diagonals for all O using methods doneOmainDiagonal and
	 * doneOSideDiagonal
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean checkDiagonalsO(String[][] array) {
		boolean doneOMainDiagonal = isMainDiagonalO(array);
		if (doneOMainDiagonal == true) {
			System.out.println("Winner is player O!");
			return true;
		}

		boolean doneOSideDiagonal = isSideDiagonalO(array);
		if (doneOSideDiagonal == true) {
			System.out.println("Winner is player O!");
			return true;
		}

		return false;
	}

	/**
	 * Checks if X player is winner
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean checkX(String[][] array) {
		boolean doneRowsAndColumnsX = checkRowsAndColumnsX(array);
		if (doneRowsAndColumnsX == true) {
			return true;
		}

		boolean doneDiagonalsX = checkDiagonalsX(array);
		if (doneDiagonalsX == true) {
			return true;
		}

		return false;
	}

	/**
	 * Checks if O player is a winner
	 * 
	 * @param array
	 *            game field
	 * @return boolean
	 */
	public static boolean checkO(String[][] array) {
		boolean doneRowsAndColumnsO = checkRowsAndColumnsO(array);
		if (doneRowsAndColumnsO == true) {
			return true;
		}

		boolean doneDiagonalsO = checkDiagonalsO(array);
		if (doneDiagonalsO == true) {
			return true;
		}

		return false;
	}
}
