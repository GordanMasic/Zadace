import java.util.Scanner;

public class Product {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Calculating square of integer number
		System.out.print("Input one integer number: ");
		int num1 = in.nextInt();
		System.out.println("Square of that number is: " + sqr(num1));
		System.out.println();

		// Calculating square of decimal number
		System.out.print("Input one decimal number: ");
		double num2 = in.nextDouble();
		System.out.println("Square of that number is: " + sqr(num2));
		System.out.println();

		// Calculating product of two integer numbers
		System.out.print("Input first integer number: ");
		int numI1 = in.nextInt();
		System.out.print("Input second integer number: ");
		int numI2 = in.nextInt();
		System.out.print("Product of theese two numbers is: "
				+ product(numI1, numI2));
		System.out.println();
		System.out.println();

		// Calculating product of two decimal numbers
		System.out.print("Input first decimal number: ");
		double numD1 = in.nextDouble();
		System.out.print("Input second decimal number: ");
		double numD2 = in.nextDouble();
		System.out.print("Product of theese two numbers is: "
				+ product(numD1, numD2));
		System.out.println();
		
		in.close();
	}

	/**
	 * Returns square of integer number
	 * 
	 * @param num
	 * @return square
	 */
	public static int sqr(int num) {
		int square = num * num;
		return square;
	}

	/**
	 * Returns the square of double number
	 * 
	 * @param num
	 * @return square
	 */
	public static double sqr(double num) {
		double square = num * num;
		return square;
	}

	/**
	 * Returns product of two integer numbers
	 * 
	 * @param num1
	 * @param num2
	 * @return product
	 */

	/**
	 * Returns product of two double numbers
	 * 
	 * @param num1
	 * @param num2
	 * @return product
	 */
	public static int product(int num1, int num2) {
		int prod = num1 * num2;
		return prod;

	}

	public static double product(double num1, double num2) {
		double prod = num1 * num2;
		return prod;
	}

}
