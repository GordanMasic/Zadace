import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
/**
 * Program returns an array whose every element has a number of existing number in original array
 */
		System.out.println("Insert string array length:");
		int length = in.nextInt();
		String[] array1 = new String[length];
		for (int i = 0; i < length; i++) {
			array1[i] = in.next();
		}in.close();

		int counter = 0;
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter6 = 0;
		int counter7 = 0;
		int counter8 = 0;
		int counter9 = 0;

		String str = "";

		char c;

		for (int i = 0; i < array1.length; i++) {
			str = (array1[i]);
			for (int j = 0; j < str.length(); j++) {
				c = str.charAt(j);
				int num = (int) c - 48;
				switch (num) {
				case 0:
					counter++;
					break;
				case 1:
					counter1++;
					break;
				case 2:
					counter2++;
					break;
				case 3:											//For every number counter will actually
					counter3++;									//count how many time in original array it exist
					break;
				case 4:
					counter4++;
					break;
				case 5:
					counter5++;
					break;
				case 6:
					counter6++;
					break;
				case 7:
					counter7++;
					break;
				case 8:
					counter8++;
					break;
				case 9:
					counter9++;
					break;
				}
			}

		}
		int[] array2 = new int[] { counter, counter1, counter2, counter3,
				counter4, counter5, counter6, counter7, counter8, counter9 };
		System.out.println(Arrays.toString(array2));

	}

}
