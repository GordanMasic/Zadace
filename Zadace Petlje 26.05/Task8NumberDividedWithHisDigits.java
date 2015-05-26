import java.util.Scanner;

public class Task8NumberDividedWithHisDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int num = input.nextInt();
		int digit = 0;
		int sum = 0;
		
		
		for (int j = 1; j < num; j++) {
			
			digit = 0;
			sum = 0;
			
			for (int i = j; i > 0; i = i / 10) {
				digit = i % 10;
				sum += digit;
			}
			
			if(j % sum == 0){
				System.out.println(j);
			}
		}
		input.close();
	}

}

