public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program discovers your zodiac by the inputed birthday date
		
		int day = 5;
		int month = 12;

		double capricorn = 1.2;
		double aquarius = 2.19;
		double pisces = 3.2;
		double aries = 4.2;
		double taurus = 5.21;
		double gemini = 6.21;
		double cancer = 7.22;
		double leo = 8.22;
		double virgo = 9.23;
		double libra = 10.23;
		double scorpio = 11.22;
		double sagittarius = 12.21;

		double div = (double) day / 100.00;
		double date = (double) month + div;

		if (date > sagittarius && date <= capricorn)
			System.out.println("Capricorn");
		else if (date > capricorn && date <= aquarius)
			System.out.println("Aquarius");
		else if (date > aquarius && date <= pisces)
			System.out.println("Pisces");
		else if (date > pisces && date <= aries)
			System.out.println("Aries");
		else if (date > aries && date <= taurus)
			System.out.println("Taurus");
		else if (date > taurus && date <= gemini)
			System.out.println("Gemini");
		else if (date > gemini && date <= cancer)
			System.out.println("Cancer");
		else if (date > cancer && date <= leo)
			System.out.println("Leo");
		else if (date > leo && date <= virgo)
			System.out.println("Virgo");
		else if (date > virgo && date <= libra)
			System.out.println("Libra");
		else if (date > libra && date <= scorpio)
			System.out.println("Scorpio");
		else
			System.out.println("Sagittarius");

	}

}
