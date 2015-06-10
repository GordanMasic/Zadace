package ba.bitcamp.gordan;

public class Task2 {

	public static void main(String[] args) {

		int[][] array = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };

		// Calling method to print matrix

		System.out.println();
		Methods.print2DArray(array, 3);
		System.out.println();

		// Calling method to find out how many rows and columns have sum zero
		System.out.println("In this matrix there are totally "
				+ Methods.getNumOfZeroRowsAndColumns(array));
		System.out.println("both the rows and columns whose sum is zero.");
	}

}
