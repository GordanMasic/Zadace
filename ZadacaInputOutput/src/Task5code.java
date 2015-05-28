
public class Task5code {

	public static void main(String[] args) {
		
		TextIO.readFile("src/Decimal.in");
		int decimal = TextIO.getInt();
		TextIO.readStandardInput();
		int binary = 0;
		int b = 1;
		
		TextIO.writeFile("src/Binary.out");
		for(int i = decimal; i > 0; i /= 2){
		binary += (i % 2)*b;
		b*=10;
		}
		TextIO.putln(binary);
		TextIO.writeStandardOutput();
	}

}
