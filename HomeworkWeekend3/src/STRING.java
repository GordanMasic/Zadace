
public class STRING {

	public static void mixedStrings(String n, String m) {

		// METHOD#1
		String mixedStrings = "";
		// If second string is longer
		if (n.length() < m.length()) {
			for (int i = 0; i < n.length(); i++) {
				mixedStrings += n.charAt(i);
				mixedStrings += m.charAt(i);
			} // add rest of second string
			for (int j = n.length(); j < m.length(); j++) {
				mixedStrings += m.charAt(j);
			}
			System.out.println(mixedStrings); // print mix of strings
			// if first string is longer
		} else if (m.length() < n.length()) {
			for (int i = 0; i < m.length(); i++) {
				mixedStrings += n.charAt(i);
				mixedStrings += m.charAt(i);
			} // add rest of first string
			for (int j = m.length(); j < n.length(); j++) {
				mixedStrings += n.charAt(j);
			}
			System.out.println(mixedStrings); // print mix of strings
		} else { // if strings were same length
			for (int i = 0; i < m.length(); i++) {
				mixedStrings += n.charAt(i);
				mixedStrings += m.charAt(i);
			}
			System.out.println(mixedStrings);
		}
	}

	// METHOD#2
	public static boolean repOfChars(String a, String b) {
		int counter = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					counter++;
					break;
				}
			}
		}
		if (counter == a.length())
			return true;
		else
			return false;
	}

	// METHOD#3
	public static String higherString(String a, String b) {

		int num1 = a.compareTo(b);
		int num2 = b.compareTo(a);

		if (num1 > num2)
			return a;
		else
			return b;

	}

	// METHOD#4
	public static boolean sameChars(String a, String b) {
		int counter = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					counter++;
					break;
				}
			}
		}
		if (counter == a.length() && counter == b.length())
			return true;
		else
			return false;
	}


	public static void main(String[] args) {

		String a = "java";
		String b = "ajva";
		System.out.println(sameChars(a, b));
	}


}
