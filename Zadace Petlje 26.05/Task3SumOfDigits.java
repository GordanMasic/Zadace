import java.util.Scanner;

public class Task3SumOfDigits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Input random number: ");
		int number = in.nextInt();
		int sum = 0;

		for (int a = number; a > 0; a /= 10) {
			sum += a % 10;
		}
		System.out.println("Sum of inputed number's digits is: " + sum);
		in.close();
	}

}
