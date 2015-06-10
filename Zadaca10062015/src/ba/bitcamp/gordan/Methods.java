package ba.bitcamp.gordan;

import java.util.InputMismatchException;

public class Methods {

	/**
	 * Returns matrix filled with random numbers from 0 to 9 Dimensions of
	 * matrix define user
	 * 
	 * @param dimension
	 *            - user defines matrix dimensions Dimension format is N x N
	 * @return matrix filled with random numbers with dimensions N x N
	 * 
	 * @throws InputMismatchException
	 *             if inputed dimension isn't number
	 */
	public static int[][] makeMatrix(int row, int column) {
		int[][] matrix = new int[row][column];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			int j = (int)(Math.random()*column);
				matrix[i][j] = (int) (Math.random() * -10);
			}
		
		
		
		return matrix;
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
	public static void print2DArray(int[][] array, int column) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");

				if (j == column - 1) {
					System.out.print("\n");
				}
			}
		}
	}

	/**
	 * Calculates how many times some number is repeated in matrix
	 * 
	 * @param matrix
	 *            matrix we are searching in
	 * @param num
	 *            number we are searching for
	 * @return counter of repeating number
	 */
	public static int countNumber(int[][] matrix, int num) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == num) {
					counter++;
				}
			}
		}
		return counter;
	}
	/**
	 * Returns number of zero sum rows and columns from inputed matrix
	 * @param matrix	type integer
	 * @return <b>counter</b>	type integer
	 */
	public static int getNumOfZeroRowsAndColumns(int[][] matrix){
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				
				sum += matrix[i][j];
				
			}
			if (sum == 0) {
				counter++;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			int sum=0;
			for (int j = 0; j < matrix[i].length; j++) {
				
				sum += matrix[j][i];
			}
			if(sum==0){
				counter++;
			}
		}
		return counter;
	}
	
}
