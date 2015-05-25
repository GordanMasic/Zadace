
public class SumEvenNumbers {

	public static void main(String[] args) {
		
			// Program returns sum of the even numbers in range from 1 to N
			
			int numbers = 100;

			int sum = 0;

			int num = 1;

			while (num < numbers) {
			// Program doesn't include number N
				if (num % 2 == 0) {
			// Even numbers divided with 2 have no residuum
					sum += num;
				}

				num++;
			}
			System.out.println(sum);

	}

}
