import java.util.Scanner;

public class Task2Fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Which number from Fibonacci sequence you want in range  of (1 - 50): ");

		int number = in.nextInt();

		long first = 1;

		long second = 0;

		long third = 0;
		
		if (number <= 50){
			for (int counter = 1; counter < number; counter++) {

				third = first + second;
				second = first;
				first = third;

			}
			System.out.printf("%d. number in Fibonacci sequence is %d", number, first);
			
		}else {
			System.out.println("Wrong input!!");
		}
		
		in.close();
	}

}
