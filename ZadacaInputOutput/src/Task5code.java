
public class Task5code {

	public static void main(String[] args) {
		
		/**Program reads decimal number from file "Decimal.in",
		 * transforms him into binary number and puts it into
		 * file "Binary.out"
		 */
		
		TextIO.readFile("src/Decimal.in");		//Start of reading from file Decimal.in
		
		int decimal = TextIO.getInt();			//Reading decimal number from file
		
		TextIO.readStandardInput();				//End of reading
		
		int binary = 0;
		int b = 1;
		
		TextIO.writeFile("src/Binary.out");		//Start of putting into file Binary.out
		
		for(int i = decimal; i > 0; i /= 2){	
		binary += (i % 2)*b;
		b*=10;
		}
		
		TextIO.putln(binary);					//Putting binary number into file
		
		TextIO.writeStandardOutput();			//End of putting
	}

}
