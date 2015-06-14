package ba.bitcamp.weekend4.homework.school.gordan.masic.copy;

public class SchoolClass {

	public String className;
	public int numberOfStudents;

	//Constructor
	public SchoolClass(String className, int numberOfStudents) {
		super();
		this.className = className;
		this.numberOfStudents = numberOfStudents;
	}

	//toString method
	public String toString() {
		String s = "\n";
		s += "Class: " + className + "\n";
		s += "Number of students: " + numberOfStudents + "\n";
		return s;
	}

}
