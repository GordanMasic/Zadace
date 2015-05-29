public class Task2code {

	public static void main(String[] args) {

		/**
		 * Program reads numbers from file "Task02input.txt" and gives sum of
		 * those numbers. When it reads number -1 program ends
		 */

		TextIO.readFile("src/Task02input.txt");		//Start of reading
		int sum = 1;
		int i = 0;
		do {
			int num = TextIO.getInt();				// Reading number from file
			sum += num;
			i = num;
		} while (i != -1);
		System.out.println(sum);
		TextIO.readStandardInput();					//End of reading
	}

}
