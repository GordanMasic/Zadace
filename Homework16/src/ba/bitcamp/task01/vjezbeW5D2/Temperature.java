package ba.bitcamp.task01.vjezbeW5D2;

public class Temperature {

	private double degreeCelsius;

	/**
	 * Constructor for making Temperature objects in Celsius degrees
	 * 
	 * @param temp
	 *            value of temperature
	 */
	public Temperature(double temp) {
		this.degreeCelsius = temp;
	}

	/**
	 * Gets value of temperature in Celsius degrees
	 * 
	 * @return degrees(<b>double</b>)
	 */
	public double getTemperatureInC() {
		return degreeCelsius;
	}

	/**
	 * Sets value of temperature in Celsius degrees
	 * 
	 * @param degree
	 *            value of temperature
	 */
	public void setTemperature(double degree) {
		this.degreeCelsius = degree;
	}

	/**
	 * toString method for printing temperature in Celsius degrees
	 */
	public String toString() {
		String output = String.format("Temperature in ºC: %f", degreeCelsius);
		return output;
	}

	/**
	 * Returns temperature in Kelvin degrees
	 * 
	 * @return degrees(<b>double</b>)
	 */
	public double getTemperatureInK() {
		double degreeKelvin = degreeCelsius + 273.15;
		return degreeKelvin;
	}

	/**
	 * Returns temperature in Fahrenheit degrees
	 * 
	 * @return degrees(<b>double</b>)
	 */
	public double getTemperatureInF() {
		double degreeFahrenheit = (degreeCelsius * 9 / 5) + 32;
		return degreeFahrenheit;
	}

}
