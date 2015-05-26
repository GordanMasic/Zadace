import java.util.Scanner;

public class Task10CommonHighestDivider {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Input 1st number: ");
		int num1 = input.nextInt();
		System.out.print("Input 2nd number: ");
		int num2 = input.nextInt();
		int min = num1;
		boolean found = false;
		
		
		if(num1 > num2){
			min = num2;
		}
		
		
		for (int i = min; i > 1; i--) {
			if(num1 % i == 0 && num2 % i == 0){
				System.out.println("Highest common divider is " + i);
				found = true;
				break;
			}
		}
		
		
		if(found == false){
			System.out.println("No common dividers.");
		}
		
		input.close();
	}
}