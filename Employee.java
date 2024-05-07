package task_10_guvi;

public class Employee {
//	Declaring data members for id, first name, last name and salary
	int id, salary;
	String firstName, lastName;

//	Constructor for Employee class with id, first name, last name and salary
	Employee(int ID, String fName, String lName, int sal) {
		id = ID;
		firstName = fName;
		lastName = lName;
		salary = sal;
	}
//	getter method for ID
	int getID() {
		return id;
	}

//	getter method for first name
	String getFirstName() {
		return firstName;
	}

//	getter method for last name
	String getLastName() {
		return lastName;
	}

//	getter method for name, which returns both the first and last name combined 
	String getName() {
		return firstName + " " + lastName;
	}

//	getter method for salary
	int getSalary() {
		return salary;
	}

//	setter method for salary
	void setSalary(int sal) {
		salary = sal;
	}

//	getter method for annual salary, which returns the salary by multiplying it to 12 
	int getAnnualSalary() {
		return salary * 12;
	}

//	method for raising salary with specified percentage
	int raiseSalary(int percent) {
		salary *= percent / 100;
		return salary;
	}

//	toString() method
	public String toString() {
		return "Employee [id = " + getID() + ", name = " + getName() + ", salary = " + getSalary() + "]";
	}

	public static void main(String[] args) {
//		Object creation for Employee class with id, first name, last name and salary without raising the salary
		Employee employee1 = new Employee(1001, "Rajesh", "Kumar", 30000);
		System.out.println(employee1.toString() + " | Annual Salary: " + employee1.getAnnualSalary());

//		Object creation for Employee class with id, first name, last name and salary by raising the salary
		Employee employee2 = new Employee(1002, "Matthew", "Murdock", 20000);
		employee2.raiseSalary(20);
		System.out.println(employee2.toString() + " " + (float)20/100);
	}
}