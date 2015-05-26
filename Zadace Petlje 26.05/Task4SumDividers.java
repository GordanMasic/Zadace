import java.util.Scanner;

public class Task4SumDividers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	int number = 0;
		do {
			
			System.out.print("Input random number: ");
			number = in.nextInt();
			int sum = 0;
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					sum += i;
				}

			}
			
			System.out.printf("Sum of your number dividers is: %d\n", sum);

		} while (number != 0);
		in.close();
	}

}
