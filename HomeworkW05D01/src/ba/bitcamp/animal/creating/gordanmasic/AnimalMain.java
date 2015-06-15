package ba.bitcamp.animal.creating.gordanmasic;

public class AnimalMain {

	public static void main(String[] args) {

		Animal a1 = new Animal("Animal 1", 1, 1);

		Animal a2 = new Animal("Animal 2", 2, 3);

		// „It’s fine. The animal is active and has water.”

		a1.printStatus();
		System.out.println();
		// “The animal is not active and it does not have enough water.”

		a2.printStatus();
		System.out.println();
		Animal.cycleDayNight(); // Day turns into night, and night turns into
								// day

		Animal.setAmountOfWater(4); // Amount of water is now on level 3
		System.out.println();
		// “The animal is not active, but has enough water.”

		a1.printStatus();
		System.out.println();
		// “It’s fine. The animal is active and has water.”

		a2.printStatus();

	}
}
