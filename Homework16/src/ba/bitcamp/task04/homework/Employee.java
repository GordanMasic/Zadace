package ba.bitcamp.task04.homework;

public class Employee {

	private String employeeName;
	private String gender;
	private double monthSalary;

	/**
	 * Constructor for creating Employee objects
	 * 
	 * @param employeeName
	 *            employee name
	 * @param gender
	 *            employee gender
	 * @param salary
	 *            employee month salary
	 */
	public Employee(String employeeName, String gender, double salary) {
		this.employeeName = employeeName;
		this.gender = gender;
		this.monthSalary = salary;
	}

	/**
	 * Getter for employee name
	 * 
	 * @return returns employee's name
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Getter for employee gender
	 * 
	 * @return employee's gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Getter for employee month salary
	 * 
	 * @return employee's month salary
	 */
	public double getMonthSalary() {
		return monthSalary;
	}

	/**
	 * Setter for employee month salary
	 * 
	 * @param salary
	 *            employee's month salary
	 */
	public void setMonthSalary(double salary) {
		this.monthSalary = salary;
	}

	/**
	 * toString method
	 */
	public String toString(){
		String output = String.format("\nName: %s \nGender: %s \nMonth salary: %f",	employeeName,gender,monthSalary);
		return output;
	}
}
