import java.util.Scanner;

public class Task6RightSideDigitNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input random number: ");
		int number = in.nextInt();
		System.out
				.println("Enter the position of digit from right side to left: ");
		int numOfDigit = in.nextInt();
		int digit;
		int counter = 0;
		for (int a = number; a > 0; a /= 10) {
			digit = a % 10;
			counter++;
			if (counter == numOfDigit) {
				System.out.println("Asked digit is: " + digit);
				break;

			}
		}
		in.close();
	}

}
