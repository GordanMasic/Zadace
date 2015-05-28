public class Task3code {

	public static void main(String[] args) {

		TextIO.readFile("src/Task03input.txt");
		int num = TextIO.getInt();
		TextIO.readStandardInput();

		TextIO.writeFile("src/Task03input.txt");
		TextIO.putln(num);
		for (int i = 1; i <= num; i++) {
			int j = (int) (Math.random() * 10);
			TextIO.putln(j);

		}
		TextIO.writeStandardOutput();
		int min = 10;
		int counter = 1;
		TextIO.readFile("src/Task03input.txt");
		do {
			int newNum = TextIO.getlnInt();
			if (newNum != num) {
				if (newNum < min) {
					min = newNum;
				}
			}counter++;
		} while (counter <= num+1);
		TextIO.readStandardInput();
		System.out.println(min);

	}

}
