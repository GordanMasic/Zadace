import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declaring and initializing variables
		System.out.print("Input number of containers: ");
		int containers = input.nextInt();
		int newNumOfContainers = containers;
		System.out.print("Input capacity: ");
		int capacity = input.nextInt();
		int additionalContainers = 0;
		boolean canFit = true;

		// Checking if number of containers is more than the capacity
		while (newNumOfContainers > capacity) {
			if (!canFit) {
				// Adding additional containers
				newNumOfContainers = containers + additionalContainers;
				canFit = true;
			}
			if (newNumOfContainers % 2 == 0) {
				// Joining containers
				newNumOfContainers /= 2;
			} else {
				// Can not join, adding one more additional container
				canFit = false;
				additionalContainers++;
			}
		}

		// Printing results
		System.out.println("Additional containers: " + additionalContainers);

		input.close();
	}
}