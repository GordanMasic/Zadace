package ba.bitcamp.safe.creating.gordanmasic;

public class SafeMain {

	public static void main(String[] args) {

		Safe s = new Safe("Crni fond"); // Creating new safe

		s.printInformation(); // Printing informations about money balance

		s.addMoney(30); // Adding 30 pounds in to safe

		s.printInformation(); // Printing informations about money balance

		s.addMoney(100); // Adding 100 pounds in to safe

		s.printInformation(); // Printing informations about money balance

		s.clear(); // Removing all money from safe

		s.printInformation(); // Printing informations about money balance

	}

}
