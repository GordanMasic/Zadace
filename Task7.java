
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program returns the sum of inputed number digits
		
		int num = 2855;
		
		int num1 = num / 1000;
		int residuum = num % 1000;
		
		int num2 = residuum / 100;
		int residuum1 = residuum % 100;
		
		int num3 = residuum1 / 10;
		int num4 = residuum1 % 10;
		
		int sum = num1 + num2 + num3 + num4;
		
		System.out.printf("Given number %d sum of digits is: %d ", num, sum);

	}

}
