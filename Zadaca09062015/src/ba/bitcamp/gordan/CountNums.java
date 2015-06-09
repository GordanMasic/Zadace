package ba.bitcamp.gordan;

public class CountNums {

	/**
	 * Main method calls countNumbers method if none exception is thrown
	 * @param args parameters are inputed trough command line
	 * @throws IndexOutOfBoundsException if more then one string is inputed
	 * @throws NullPointerException if none string is inputed
	 */
	public static void main(String[] args) {

		try {
			if (args.length > 1) {
				throw new NullPointerException();
			} else {
				String s = "";
				if (args[0].equals(s)) {
					throw new IndexOutOfBoundsException();
				} else
					System.out.printf("%s has %d numbers.", args[0],
							countNumbers(args));
			}
		}catch (NullPointerException e){
			System.out.println("Please insert only one String!");
		} catch (IndexOutOfBoundsException e1) {
			System.out.println("Please pass one String to programm!");
		}

	}

	/**
	 * Returns number of number characters in inputed string
	 * @param array string from command line
	 * @return counter - number of number characters
	 */
	public static int countNumbers(String[] array) {

		char c = ' ';
		int counter = 0;
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i];
		}

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c - 48 < 10) {
				counter++;
			}
		}

		return counter;
	}

}
