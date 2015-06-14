package ba.bitcamp.weekend4.homework.school.gordan.masic.copy;

public class Director {

	public String directorName;
	public int yearOfBirth;

	// Constructor
	public Director(String directorName, int yearOfBirth) {
		super();
		this.directorName = directorName;
		this.yearOfBirth = yearOfBirth;
	}

	// toString methods
	public String toString() {
		String s = "\n";
		s += "Director: " + directorName + "\n";
		s += "Born: " + yearOfBirth + "\n";
		return s;
	}

}
