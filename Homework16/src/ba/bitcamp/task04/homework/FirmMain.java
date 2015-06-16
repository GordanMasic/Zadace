package ba.bitcamp.task04.homework;

public class FirmMain {

	public static void main(String[] args) {

		// Creating employees
		Employee e1 = new Employee("John Doe", "male", 2500.00);
		Employee e2 = new Employee("Andy Warhole", "male", 2500.00);
		Employee e3 = new Employee("Cathrine Z Jones", "female", 2500.00);
		Employee e4 = new Employee("Ruby Tuesday", "female", 2000.00);
		Employee e5 = new Employee("Richie Blackmoore", "male", 3500.00);

		// Creating an array of employees
		Employee[] employees = new Employee[4];
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		employees[3] = e4;

		// Creating a firm
		Firm f1 = new Firm("Boolean", e5, employees);

		// Calling methods
		System.out.println(f1 + "\n");
		System.out.println("Sum of salaries: "+f1.getSumOfSalaries() + "\n");
		System.out.println("There are " + f1.howManyFemaleEmployees()
				+ " female employees\n");
		f1.raiseSalaryToAll(500);
		System.out.println("Sum of salaries after raise: "+f1.getSumOfSalaries() + "\n");

	}

}
