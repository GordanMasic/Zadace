package ba.bitcamp.gordan;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// User inputs number of rows
		System.out.print("Input number of rows in matrix: ");
		int rows = in.nextInt();

		// User inputs number of columns
		System.out.println();
		System.out.print("Input number of columns in matrix: ");
		int columns = in.nextInt();

		System.out.print("Insert coordinate x: ");
		int x = in.nextInt();

		System.out.println("Insert coordinate y: ");
		int y = in.nextInt();

		// Calling method to create matrix with random numbers
		int[][] matrix = Methods.makeMatrix(rows, columns);

		// Calling method to print matrix
		System.out.println();
		Methods.print2DArray(matrix, columns);

		System.out.println("Highest score from that spot is: ");
		System.out.println(getMaxPoints(matrix, x, y));

		in.close();

	}

	/**
	 * Returns max score that chess jumper can get from certain field
	 * @param matrix with dimensions 3X3
	 * @param x	column coordinate
	 * @param y row coordinate
	 * @return max score
	 */
	public static int getMaxPoints(int[][] matrix, int x, int y) {
		String coordinates = "" + y + x;
		int max = 0;
		switch (coordinates) {
		case "00":
			max = Math.max(matrix[0][0], Math.max(matrix[1][2], matrix[2][1]));
			break;
		case "01":
			max = Math.max(matrix[0][1], Math.max(matrix[2][0], matrix[1][2]));
			break;
		case "02":
			max = Math.max(matrix[0][2], Math.max(matrix[1][0], matrix[2][1]));
			break;
		case "10":
			max = Math.max(matrix[1][0], Math.max(matrix[0][2], matrix[2][2]));
			break;
		case "11":
			return matrix[1][1];
		case "12":
			max = Math.max(matrix[1][2], Math.max(matrix[0][0], matrix[2][0]));
			break;
		case "20":
			max = Math.max(matrix[2][0], Math.max(matrix[1][2], matrix[0][1]));
			break;
		case "21":
			max = Math.max(matrix[2][1], Math.max(matrix[0][0], matrix[0][2]));
			break;
		case "22":
			max = Math.max(matrix[2][2], Math.max(matrix[2][0], matrix[0][1]));
			break;
		}
		return max;

	}

}
