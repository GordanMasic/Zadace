package ba.bitcamp.task04.homework;

public class Firm {

	private String firmName;
	private Employee director;
	private Employee[] employees;

	/**
	 * Constructor for creating Firm objects
	 * 
	 * @param firmName
	 *            name of firm
	 * @param director
	 *            director of firm
	 * @param employees
	 *            employees of firm
	 */
	public Firm(String firmName, Employee director, Employee[] employees) {
		this.firmName = firmName;
		this.director = director;
		this.employees = employees;
	}

	/**
	 * Returns number of employees in certain firm
	 * 
	 * @return employees array length
	 */
	public int howManyEmployees() {
		return employees.length;
	}

	/**
	 * Returns sum of salaries in the firm
	 * 
	 * @return sum
	 */
	public double getSumOfSalaries() {
		double sum = 0;
		for (int i = 0; i < employees.length; i++) {
			sum += employees[i].getMonthSalary();
		}
		return sum;
	}

	/**
	 * Returns the number of female employees
	 * 
	 * @return counter
	 */
	public int howManyFemaleEmployees() {
		int counter = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getGender().equals("female")) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Raises month salary to all employees
	 * 
	 * @param raise
	 *            amount of salary raise
	 */
	public void raiseSalaryToAll(double raise) {
		for (int i = 0; i < employees.length; i++) {
			employees[i].setMonthSalary(employees[i].getMonthSalary() + raise);
		}
	}

	/**
	 * toString method
	 */
	public String toString() {
		String output = String.format(
				"\nCompany name: %s \nDirector: %s \nNumber of employees: %d",
				firmName, director, employees.length);
		return output;
	}
}
