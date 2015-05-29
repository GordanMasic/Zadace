
public class Task4code {

	public static void main(String[] args) {
		
		/**Program reads two numbers from the file "Task04input.txt".
		 * First number n decides how many random numbers will program put in
		 * that file after number m.
		 * Second number m is number we search for among those random numbers */
		
		TextIO.readFile("src/Task04input.txt");	//Start of reading
		
		int num1 = TextIO.getInt();				//Reading number n from file
		int num2 = TextIO.getInt();				//Reading number m from file
		
		TextIO.readStandardInput();				//End of reading

		TextIO.writeFile("src/Task04input.txt");//Start of putting
		
		TextIO.putln(num1);						//Putting number n back to file
		TextIO.putln(num2);						//Putting number m back to file
		
		for (int i = 1; i <= num1; i++) {
			int j = (int) (Math.random() * 10);	
			TextIO.putln(j);					//Putting random numbers into file

		}
		TextIO.writeStandardOutput();			//End of putting
		
		int counter = 1;
		TextIO.readFile("src/Task04input.txt");	//Start of reading
		
		num1 = TextIO.getInt();					//Reading number n from file
		num2 = TextIO.getInt();					//Reading number m from file
		
		while (counter <= num1){
			int newNum = TextIO.getlnInt();
				if (newNum == num2) {
					System.out.println("There is matching random number " +newNum);
					break;
				}
				counter++;
		} 
		TextIO.readStandardInput();				//End of reading
		

	}

}
