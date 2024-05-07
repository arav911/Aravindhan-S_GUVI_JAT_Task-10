package task_10_guvi;

public class Person {
//	Declaring data members for Name and Age
	String name;
	int age;
	
//	Constructor for Person class with name and age arguments
	Person(String n, int a){
		name = n;
		age = a;
	}
	
//	Getter Method for name
	String getName() {
		return name;
	}
	
//	Getter Method for age
	int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
//		Object creation for name and age
		Person person1 = new Person("Aravindhan", 25);
		System.out.println("Name: " + person1.getName() + " | Age: " + person1.getAge());
		Person person2 = new Person("Mark", 23);
		System.out.println("Name: " + person2.getName() + " | Age: " + person2.getAge());
	}
}
