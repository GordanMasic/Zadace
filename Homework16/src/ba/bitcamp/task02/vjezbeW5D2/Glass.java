package ba.bitcamp.task02.vjezbeW5D2;

public class Glass {

	private String drinkType;
	private double currentDose;
	private double maximalDose;

	/**
	 * Constructor for creating Glass object
	 * 
	 * @param d
	 *            maximal capacity of the glass
	 */
	public Glass(double d) {
		this.drinkType = null;
		this.currentDose = 0;
		this.maximalDose = d;
	}

	/**
	 * @return the drinkType
	 */
	public String getDrinkType() {
		return drinkType;
	}

	/**
	 * @param drinkType
	 *            the drinkType to set
	 */
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	/**
	 * @return the currentDose
	 */
	public double getCurrentDose() {
		return currentDose;
	}

	/**
	 * @param currentDose
	 *            the currentDose to set
	 */
	public void setCurrentDose(int currentDose) {
		this.currentDose = currentDose;
	}

	/**
	 * @return the maximallDose
	 */
	public double getMaximalDose() {
		return maximalDose;
	}

	/**
	 * @param maximallDose
	 *            the maximallDose to set
	 */
	public void setMaximalDose(int maximalDose) {
		this.maximalDose = maximalDose;
	}

	/**
	 * Adding drink into glass
	 * 
	 * @param type
	 *            type of drink
	 * @param d
	 *            dose to add
	 */
	public void addDrink(String type, double d) {
		if (drinkType == null) {
			drinkType = type;
			currentDose += d;
		} else if (drinkType.equals(type)) {
			currentDose += d;
		}
		if (currentDose > maximalDose) {
			currentDose = maximalDose;
		}
	}

	/**
	 * Method to empty glass
	 */
	public void emptyGlass() {
		currentDose -= currentDose;
	}
	
	
	/**
	 * toString method
	 */
	public String toString(){
		String output = String.format("Glass of: %s \nDrinkStatus: %.2f", drinkType,currentDose);
		return output;
	}

}
