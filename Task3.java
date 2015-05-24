public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program finds out which of two dates comes before
		//If you input same date twice program returns message "It's a same date!"

		int day1 = 23;
		int month1 = 5;
		int year1 = 2015;
		int day2 = 2;
		int month2 = 6;
		int year2 = 2015;
		double dif1 = (double) day1 / 100;
		double dif2 = (double) day2 / 100.00;
		double date1 = (double) month1 + dif1; // We are comparing dates as decimal numbers eg. 5.23 < 6.2
		double date2 = (double) month2 + dif2;

		if (year1 != year2) {
			if (year1 > year2) {
				System.out.printf("%d.%d.%d comes before %d.%d.%d", day2,
						month2, year2, day1, month1, year1);
			} else if (year1 < year2) {
				System.out.printf("%d.%d.%d comes before %d.%d.%d", day1,
						month1, year1, day2, month2, year2);
			}

		} else if (date1 != date2) {
			if (date1 > date2) {
				System.out.printf("%d.%d.%d comes before %d.%d.%d", day2,
						month2, year2, day1, month1, year1);
			} else {
				System.out.printf("%d.%d.%d comes before %d.%d.%d", day1,
						month1, year1, day2, month2, year2);
			}
		} else 
			System.out.println("It's a same date!");

	}

}
