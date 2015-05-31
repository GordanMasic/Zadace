public class Task8 {

	public static void main(String[] args) {
		// The input string
		String a = "www.nekastranica.com?name=Jon&surname=Stark";
		// Initialization of variables
		int length = a.length();
		int counter = 0;
		String surname = "";
		String name = "";
		String reverse1 = "";
		String reverse2 = "";
		// Reading character from the end to "="
		for (int i = length - 1; i > 0; i--) {
			char character1 = a.charAt(i);
			if (character1 != '=') {
				surname += character1;
				counter++;
			} else {
				break;
			}
		}
		// Reversing characters
		int m = surname.length();
		for (int j = m - 1; j >= 0; j--) {
			char character2 = surname.charAt(j);
			reverse1 += character2;
		}
		// Increasing counter to 9 because of standard charcters length
		// "&surname="
		counter += 9;
		// Reading characters until we get to "="
		for (int k = length - (counter + 1); k > 0; k--) {
			char character3 = a.charAt(k);
			if (character3 != '=') {
				name += character3;
			} else {
				break;
			}
		}
		// Reversing characters
		int n = name.length();
		for (int p = n - 1; p >= 0; p--) {
			char character4 = name.charAt(p);
			reverse2 += character4;
		}
		surname = reverse1;
		name = reverse2;
		// Printing
		System.out.printf("%s %s", name, surname);
	}
}
