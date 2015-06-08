import java.util.Scanner;

public class LOOPS {

	//This method counts numbers between number N and number Q and 
	//if the count is odd returns all odd numbers between them
	//if the count is even returns all even numbers between them
	
	public static void numbersBetween(long num, long qNum){
		int counter = 0;
		if(num < qNum){
		for (long i = num+1; i < qNum; i++){
			counter++;
		}
		}else{
			for (long i = qNum+1; i < num; i++){
				counter++;
			}
		}
		if (counter % 2 == 0){
			System.out.println("Even number between "+num+" and "+qNum+" are: ");
			if(num < qNum){
				for (long i = num+1; i < qNum; i++){
					if (i % 2 == 0){
						System.out.println(i);
					}
				}
				}else{
					for (long i = qNum+1; i < num; i++){
						if (i % 2 == 0){
							System.out.println(i);
						}
					}
				}
		}else{
			System.out.println("Odd number between "+ num + " and "+qNum+" are: ");
			if(num < qNum){
				for (long i = num+1; i < qNum; i++){
					if (i % 2 != 0){
						System.out.println(i);
					}
				}
				}else{
					for (long i = qNum+1; i < num; i++){
						if (i % 2 != 0){
							System.out.println(i);
						}
					}
				}
			
		}
		
	}
	
	//This method replaces first and last digit of number and returns it 
	
	public static long replaceFirstAndLastDigit(long num) {
		String s = "";
		s += num;
		String s1 = "";
		String s2="";
		for(int i = s.length()-1; i >= 0; i--){
			s1 += s.charAt(i);
		}
		for(int i = s1.length()-2;i>=1;i--){
			s2 += s1.charAt(i); 
		}
		s="";
		if(s1.length()>1)
		s += s1.charAt(0) + s2 + s1.charAt(s1.length()-1);
		else s= s1;
		long q = Long.parseLong(s);
		return q;
	}

	//This method counts digits of the number
	
	public static void numOfDigits(long num) {

		String s = "";
		s += num;
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			counter++;
		}
		System.out.println("And it has " + counter + " digits.");

	}

	//This method puts a comma after every three digits starting from the end
	
	public static void threeDigitComma(long num) {
		String s = "";
		s += num;
		String r = "";
		int counter = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			counter++;
			r += s.charAt(i);
			if (counter == s.length()) {
				break;
			}
			if (counter % 3 == 0) {
				r += ",";
			}

		}
		
		s = "";
		for (int i = r.length() - 1; i >= 0; i--) {
			s += r.charAt(i);
		}
		System.out.println("Your number is: " + s);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input one number: ");
		long number = in.nextLong();
		threeDigitComma(number);
		numOfDigits(number);

		System.out
		.println("When we replace first and last digit");
System.out.println("of your number we got: "+replaceFirstAndLastDigit(number));
		long q = replaceFirstAndLastDigit(number);
		numbersBetween(number, q);
		in.close();
	}

}
