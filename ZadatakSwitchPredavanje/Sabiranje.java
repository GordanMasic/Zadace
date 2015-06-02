import java.util.Scanner;

public class Sabiranje {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				System.out
						.println("Enter a expresion eg. 2+3");
				String operation = in.nextLine();
				String equation = operation.replaceAll("\\s", "");
				int result = 0;
				int l = equation.length();
				String num1 = "";
				String num2 = "";
				int counter = 0;
				for (int i = 0; i < l; i++) {
					if (equation.charAt(i) == '+'
							|| equation.charAt(i) == '-'
							|| equation.charAt(i) == '/'
							|| equation.charAt(i) == '*') {

						counter = equation.indexOf(equation.charAt(i));
					}

				}
				num1 = equation.substring(0, counter);

				num2 = equation.substring(counter + 1, l);

				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);

				
				
				switch (equation.charAt(counter)) {
				case '+':
					result = number1 + number2;
					System.out.printf("%d %c %d = %d",number1,equation.charAt(counter),number2,result);
					break;
				case '-':
					result = number1 - number2;
					System.out.printf("%d %c %d = %d",number1,equation.charAt(counter),number2,result);					break;
				case '/':
					result = number1 / number2;
					System.out.printf("%d %c %d = %d",number1,equation.charAt(counter),number2,result);					break;
				case '*':
					result = number1 * number2;
					System.out.printf("%d %c %d = %d",number1,equation.charAt(counter),number2,result);					break;
				}

				break;
			} catch (NumberFormatException e) {
				System.out.println("Wrong input!");
			}
			
		}in.close();
	}
}