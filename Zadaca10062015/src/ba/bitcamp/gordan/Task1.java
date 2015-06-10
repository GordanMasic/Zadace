package ba.bitcamp.gordan;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// User inputs number of rows
		System.out.print("Input number of rows in matrix: ");
		int rows = in.nextInt();

		// User inputs number of columns
		System.out.println();
		System.out.print("Input number of columns in matrix: ");
		int columns = in.nextInt();

		// User inputs number to search in matrix
		System.out.println();
		System.out.println("Which number xou want to know ");
		System.out.print("how many time is repeated in matrix? ");
		int num = in.nextInt();

		// Calling method to create matrix with random numbers
		int[][] matrix = Methods.makeMatrix(rows, columns);

		// Calling method to print matrix
		System.out.println();
		Methods.print2DArray(matrix, columns);

		// Calling method to find how many times is wanted number repeated in
		// matrix user created
		System.out.println();
		System.out.printf("Number %d is repeating %d times in matrix. ", num,
				Methods.countNumber(matrix, num));

		in.close();
	}

}
