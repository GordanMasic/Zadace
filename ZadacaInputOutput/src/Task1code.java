
public class Task1code {

	public static void main(String[] args) {
		
		TextIO.readFile("src/Task01input.txt");
		int num1 = TextIO.getInt();
		int num2 = TextIO.getInt();
		while (++num1 < num2){
			System.out.printf("%d ", num1);
			
		}

	}

}
