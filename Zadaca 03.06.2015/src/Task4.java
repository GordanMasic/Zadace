import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		/**
		 * Program moves letters(elements) for how many places you want to left or right side
		 * depending whether the inputed number is positive or negative
		 */
		Scanner in = new Scanner(System.in);

		System.out.println("Input number N: ");
		int n = in.nextInt();
		in.close();
		char[] array = new char[] { 'I', 'N', 'G', 'B', 'I', 'T', 'C', 'A',
				'M', 'P' };
		char[] array1 = new char[array.length];

		if (n >= 0 || n % array.length == 0) {

			int i = 0;
			n = n % array.length;

			while (i < array.length) {
				while (n < array.length) {			//Moving elements to the right side

					array1[n] = array[i];
					n++;

					if (n == array.length) {
						n -= n;
					}
					break;
				}
				i++;
			}

			System.out.println(Arrays.toString(array1));

		} else {
			int i = 0;
			n = array.length + n;
			
			while (i < array.length) {
				while (n < array.length) {
															//Moving elements to the left side
					array1[n] = array[i];
					n++;

					if (n == array.length) {
						n -= n;
					}
					break;
				}
				i++;
			}

			System.out.println(Arrays.toString(array1));
		}
	}

}
