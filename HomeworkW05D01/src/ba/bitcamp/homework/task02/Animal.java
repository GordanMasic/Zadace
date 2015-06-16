package ba.bitcamp.homework.task02;

public class Animal {

	@SuppressWarnings("unused")
	private String animalName;
	private int activity;
	private int waterNeed;
	private static int timeOfDay = 1;
	private static int amountOfWater = 1;

	/**
	 * Constructor
	 * 
	 * @param animalName
	 *            name of animal
	 * @param activity
	 *            activity of animal during night or during day
	 * 
	 * @param waterNeed
	 *            how much does animal need water less, more or a lot
	 */
	public Animal(String animalName, int activity, int waterNeed) {
		super();
		this.animalName = animalName;
		this.activity = activity;
		this.waterNeed = waterNeed;
	}

	/**
	 * Transforms day into night and night into day
	 */
	public static void cycleDayNight() {
		if (timeOfDay == 1) {
			timeOfDay = 2;
		} else {
			timeOfDay = 1;
		}
	}

	/**
	 * Sets level for amount of water in habitat
	 * 
	 * @param number
	 *            water level
	 * @throws NumberFormatException
	 */
	public static void setAmountOfWater(int number) {

		try {
			if (number >= 0 && number <= 3) {
				amountOfWater = number;
			} else {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException e) {
			System.out
					.println("Wrong inputed amount of water level! Level is still "
							+ Animal.getAmountOfWater());
		}
	}

	/**
	 * Returns amount of water level
	 * 
	 * @return level
	 */
	public static int getAmountOfWater() {
		return amountOfWater;
	}

	/**
	 * Prints out animal status whether the animal is active or not and how much
	 * of water it has
	 */
	public void printStatus() {
		if (activity == timeOfDay && waterNeed == amountOfWater) {
			System.out
					.println("It’s fine. The animal is active and has water.");
		} else if (activity == timeOfDay && waterNeed != amountOfWater) {
			System.out
					.println("The animal is active, but does not have enough water.");
		} else if (activity != timeOfDay && waterNeed == amountOfWater) {
			System.out
					.println("The animal is not active, but has enough water.");
		} else {
			System.out
					.println("The animal is not active and it does not have enough water.");
		}

	}

}
