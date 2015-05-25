public class PerfectNumber {

	public static void main(String[] args) {

		// Program returns whether the inputed number is perfect or not

		int number = 496;
		int sum = 0;
		int counter = 1;

		while (counter < number) {
			
			if (number % counter == 0) {
				sum += counter;
			}
			counter++;
		}
		
		// Perfect number is equal to sum of his dividers
		
		if (sum == number) {
			System.out.println("It's a perfect number!");
		} else {
			System.out.println("It's not a perfect number!");
		}

	}

}
