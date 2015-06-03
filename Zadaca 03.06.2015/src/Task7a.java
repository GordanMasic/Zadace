import java.util.Arrays;
import java.util.Scanner;

public class Task7a {

	public static void main(String[] args) {

		// This program calculates the searching time of a binary search and
		// standard linear search

		Scanner in = new Scanner(System.in);

		// Declarating an array of a 100000 elements
		long[] array = new long[100000];

		// Inputing random numbers into array
		for (int i = 0; i < array.length; i++) {
			array[i] = (long) (Math.random() * 99999);
		}

		System.out.println(Arrays.toString(array));

		// Sorting an array
		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		// Inputing number that user wants to search
		System.out.println("Which number you seek in the array: ");
		long number = in.nextLong();

		// Starting to calculate time of searching
		long start_time = System.currentTimeMillis();

		// Searching the number
		long index = Arrays.binarySearch(array, number);

		// Printing the result of a search
		if (index >= 0) {
			System.out.println("Your number is on postition " + index);
		} else {
			System.out.println("There is no such a number!");
		}

		// Stoping to caclulate time of searching
		long end_time = System.currentTimeMillis();

		// Printing time of start and end
		System.out.println("Start: " + start_time);
		System.out.println("End: " + end_time);

		int counter = 0;

		// Starting to calculate time of searching
		long start_time2 = System.currentTimeMillis();

		// Searcing the number
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				counter++;
				index = i;
				break;
			}
		}

		// Printing the result
		if (counter > 0) {
			System.out.println("Your number is on postition " + index);
		} else {
			System.out.println("There is no such a number!");
		}

		// Stoping to caclulate time of searching
		long end_time2 = System.currentTimeMillis();

		// Printing time of start and end
		System.out.println("Start: " + start_time2);
		System.out.println("End: " + end_time2);

		in.close();
	}

}
