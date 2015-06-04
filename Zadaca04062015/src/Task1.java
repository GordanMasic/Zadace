public class Task1 {

	public static int getMin2(int num1, int num2) {
		return (num1 <= num2) ? num1 : num2; // Method returns lower number

	}

	public static int getMin3(int num1, int num2, int num3) {
		return (num1 <= getMin2(num2, num3)) ? num1 : getMin2(num2, num3);
		// Method returns lowest from three number
	}

	public static void main(String[] args) {

		System.out.println(getMin2(5, 0)); // Calling first method
		System.out.println(getMin3(5, 0, -5));// Calling second method
	}

}
