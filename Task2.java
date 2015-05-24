public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program is checking out whether inputed number is in range
		// between 5 and 7.5 , between 7.5 and 10 or it is out of these ranges

		double number = 7.5000005;

		if ((number > 5) && (number <= 7.5)) {
			System.out.println("Number " + number
					+ " is in range between 5 and 7.5");
		} else if ((number > 7.5) && (number <= 10)) {
			System.out.println("Number " + number
					+ " is in range between 7.5 and 10");
		} else {
			System.out.println("Number " + number + " is out of range");
		}
	}

}
