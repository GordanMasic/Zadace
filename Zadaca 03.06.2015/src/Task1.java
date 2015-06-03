import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		/**
		 *  Program returns an very funny array
		 */
		int[] array = new int[100];
		int j = 0;
		int i = 0;
		while (i < array.length) {
			while (j < array.length) {
				if (j <= 9) {
					array[i] += j;
					j++;
					break;
				} else {
					j = 0;
					array[i] += j;
					j++;
					break;
				}

			}
			i++;
		}
		System.out.println(Arrays.toString(array));

	}

}
