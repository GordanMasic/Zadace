public class NumberDividedByTwo {

	public static void main(String[] args) {

		// Program returns how many times can be random number divided with 2
		// before it reaches 0
		
		int number = 340;
		int counter = 0;
		int div = number;

		while (div / 2 > 0) {

			div = div / 2;
			counter++;
		}
		System.out
				.printf("Number %d can be divided with 2 for %d times before it reaches 0.",
						number, counter);
	}

}
