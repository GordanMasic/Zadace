import java.util.Scanner;


public class Task7MagicNumbersLowerThanN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Input number N: ");
		int num = in.nextInt();
		System.out.println("Magic numbers lower than N:");
		
		for(num=num;num > 1;num--) {
			
			
			int sum = 0;
			
			for(int dividers = 1;dividers < num;dividers++) {
				if(num % dividers == 0) {
					sum += dividers;
				}
				
				
			}
			
			if(sum == num) {
				System.out.println(num);
			}
			
		}
		
		in.close();
		
		}

	}



