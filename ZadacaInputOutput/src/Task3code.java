public class Task3code {

	public static void main(String[] args) {

		/**
		 * Program reads first number from the file "Task03input.txt". Number n
		 * decides how many random numbers will appear in the file after him.
		 * Program puts those numbers into the file and returns which of those
		 * numbers is lowest.
		 */
		TextIO.readFile("src/Task03input.txt");	//Start of reading
		int num = TextIO.getInt();				//Reading first number n from file
		TextIO.readStandardInput();				//End of reading

		TextIO.writeFile("src/Task03input.txt");//Start of putting 
		TextIO.putln(num);						//Putting back number n in file
		for (int i = 1; i <= num; i++) {
			int j = (int) (Math.random() * 100 + 1);
			TextIO.putln(j);					//Putting random numbers in file

		}
		TextIO.writeStandardOutput();			//End of putting
		int min = 10;
		int counter = 1;
		TextIO.readFile("src/Task03input.txt");	//Start of reading
		num = TextIO.getInt();					//Reading number n again from file
		do {
			int newNum = TextIO.getlnInt();		//Reading random numbers from file

			if (newNum < min) {
				min = newNum;
			}
			counter++;
		} while (counter <= num);
		TextIO.readStandardInput();				//End of reading
		System.out.println(min);

	}

}
