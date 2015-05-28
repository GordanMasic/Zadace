
public class Task2code {

	public static void main(String[] args) {
		TextIO.readFile("src/Task02input.txt");
		int sum = 1;
		int i = 0;
		do{
			int num = TextIO.getInt();
			sum += num;
			i = num;
		}while (i != -1);
		System.out.println(sum);

	}

}
