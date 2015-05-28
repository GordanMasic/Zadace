
public class Task4code {

	public static void main(String[] args) {
		
		TextIO.readFile("src/Task04input.txt");
		int num1 = TextIO.getInt();
		int num2 = TextIO.getInt();
		TextIO.readStandardInput();

		TextIO.writeFile("src/Task04input.txt");
		TextIO.putln(num1);
		TextIO.putln(num2);
		for (int i = 1; i <= num1; i++) {
			int j = (int) (Math.random() * 10);
			TextIO.putln(j);

		}
		TextIO.writeStandardOutput();
		int counter = 3;
		TextIO.readFile("src/Task04input.txt");
		num1 = TextIO.getInt();
		num2 = TextIO.getInt();
		 while (counter <= num1+2){
			int newNum = TextIO.getlnInt();
				if (newNum == num2) {
					System.out.println(newNum);
					break;
				}
				counter++;
		} 
		TextIO.readStandardInput();
		

	}

}
