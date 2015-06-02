import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkingDays {

	// This program is calculating if the inputed day is a working day or a
	// weekend

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				// Inputing the number of a day
				System.out.println("Input number of a day: ");
				int numDay = input.nextInt();

				// Checking if the day is working day or a weekend and printing
				// the result
				switch (numDay) {
				case 1:
					System.out.println("Work day!");
					break;
				case 2:
					System.out.println("Work day!");
					break;
				case 3:
					System.out.println("Work day!");
					break;
				case 4:
					System.out.println("Work day!");
					break;
				case 5:
					System.out.println("Work day!");
					break;
				case 6:
					System.out.println("Weekend!");
					break;
				case 7:
					System.out.println("Weekend!");
					break;
				default:
					throw new InputMismatchException();
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nPlease enter numerical value from 1 to 7.");
				input.nextLine();
			}
		}
		input.close();
	}
}
