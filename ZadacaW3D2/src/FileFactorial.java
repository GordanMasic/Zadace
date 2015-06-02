import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileFactorial {

	public static void main(String[] args) {
		/**
		 * File factorial is program that reads number from the first position
		 * in file. If there is no number on first position program ends. If you
		 * input wrong file name program doesn't end, program asks from you to
		 * repeat inputing file's name
		 */
		Scanner in = new Scanner(System.in);
		TextIO.readFile("src/File.in");
		int factorial = 1;
		while (true) {
			try {
				System.out.print("Input name of file: ");
				String fileName = in.nextLine(); // Reading inputed file name
				if (fileName.equals("File.in")) { // Checking if inputed file
													// name is correct
					int number = TextIO.getInt();
					for (int i = 1; i <= number; i++) {
						factorial *= i;

					}
					System.out.print("Factorial = " + factorial); // Printing
																	// factorial
				} else {
					throw new NoSuchElementException();				//Throwing exception if wrong file name inputed
				}																
				break;

			} catch (InputMismatchException e2) {
				System.out.println("Wrong file name. Please try again.");

			} catch (NoSuchElementException e1) {
				System.out.println("Wrong file name. Please try again.");

			} catch (IllegalArgumentException e3) {
				System.out.println("Number is not on the first place in file.");
				break;
			}
			in.close();
			TextIO.readStandardInput();
		}
	}

}
