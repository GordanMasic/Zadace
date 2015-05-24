
public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program returns whether the inputed number 
		// can be divided with his sum of digits or not

		int num = 333;
		int num1 = num / 100;
		int residuum = num % 100;
		int num2 = residuum / 10;
		int num3 = residuum % 10;
		int sum = num1 + num2 + num3;
		
		if ((num % sum) == 0){
			System.out.println("Broj " + num + " je djeljiv sa zbirom svojih cifara!");
		}else {
			System.out.println("Broj " + num + " nije djeljiv sa zbirom svojih cifara!");
		}
		
	}

}
