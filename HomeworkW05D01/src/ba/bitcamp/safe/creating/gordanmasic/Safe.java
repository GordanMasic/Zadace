package ba.bitcamp.safe.creating.gordanmasic;

public class Safe {

	@SuppressWarnings("unused")
	private String safeName;
	private double moneyBalance;

	/**
	 * Constructor
	 * 
	 * @param safeName
	 *            name of safe
	 */
	public Safe(String safeName) {
		super();
		this.safeName = safeName;
	}

	/**
	 * Adds money to the safe
	 * 
	 * @param money
	 *            amount of money
	 */
	public void addMoney(double money) {
		moneyBalance += money;
	}

	/**
	 * Removes all money from the safe
	 */
	public void clear() {
		moneyBalance -= moneyBalance;
	}

	/**
	 * Gives information how much money is in a safe
	 */
	public void printInformation() {
		if (moneyBalance == 0) {
			System.out.println("It's empty ...");
		} else if (moneyBalance > 0 && moneyBalance <= 20) {
			System.out.println("There's some, but not much.");
		} else if (moneyBalance > 20 && moneyBalance <= 100) {
			System.out.println("There's some.");
		} else {
			System.out.println("There's a lot.");
		}
	}
}
