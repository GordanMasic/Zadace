public class Task1code {

	public static void main(String[] args) {
		/**
		 * Program reads two numbers from file "Task01input.txt" and prints all
		 * numbers between those two numbers
		 */
		TextIO.readFile("src/Task01input.txt");	//Start of reading

		int num1 = TextIO.getInt();				// Reading first number from file
		int num2 = TextIO.getInt();				// Reading second number from file

		while (++num1 < num2) {
			System.out.printf("%d ", num1);

		}
		TextIO.readStandardInput();				//End of reading
	}

}
