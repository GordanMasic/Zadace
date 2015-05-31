import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declaring and initializing variables
		System.out.print("Input number: ");
		int num = input.nextInt();
		int factorial = 1;
		int output = 0;

		// Getting last six digits of factorial, excluding last zeros
		for (int i = 1; i <= num; i++) {
			factorial *= i;
			while (factorial % 10 == 0) {
				factorial /= 10;
			}
			factorial %= 1000000;
		}

		// Getting last two digits that are not 0
		output = factorial % 100;
		while (output < 10) {
			factorial /= 10;
			if (factorial == 0) {
				// In case that input is 1, 2 or 3
				break;
			}
			output = (factorial % 10) * 10 + output;
		}

		// Printing result
		System.out.println(output);

		input.close();

	}

}
