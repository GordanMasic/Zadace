package ba.bitcamp.task01.vjezbeW5D2;

public class TemperatureMain {

	public static void main(String[] args) {

		// Creating temperature object
		Temperature t1 = new Temperature(1);

		// Getting temperature in Kelvin
		System.out.println(t1.getTemperatureInK());

		// Setting new temperature value
		t1.setTemperature(10);

		// Getting temperature in Fahrenheit
		System.out.println(t1.getTemperatureInF());
	}

}
