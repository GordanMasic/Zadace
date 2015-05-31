public class Task2 {

	public static void main(String[] args) {

		String serijeZagrada = ("{{{}");

		int b = serijeZagrada.length();

		int counterZaPrvu = 0;
		int counterZaDrugu = 0;

		for (int i = 0; i < b; i++) {
			char c = serijeZagrada.charAt(i);
			char prva = '{';
			char druga = '}';

			if (c == prva) {
				counterZaPrvu++;
			} else if (c == druga) {
				counterZaDrugu++;
			}

		}

		if (counterZaPrvu != counterZaDrugu) {
			System.out.println("Bracket is not closed.");
		} else {
			System.out.println("All closed.");
		}

	}

}
