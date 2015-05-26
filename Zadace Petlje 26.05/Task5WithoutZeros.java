import java.util.Scanner;
public class Task5WithoutZeros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int num = in.nextInt();
		int newNum = 0;
		int b = 1;
		
		for(int i = num;i != 0;i /= 10) {
			
			if(i % 10 != 0) {
				newNum += (i % 10) * b;
				b *= 10;
			}
			
			
		}
		
		System.out.printf("Number without zeros is: %d", newNum);
		in.close();
	}

}
