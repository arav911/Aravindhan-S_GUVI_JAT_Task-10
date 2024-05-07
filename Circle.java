package task_10_guvi;

public class Circle {
//	Declaring data member for radius
	int radius;

//	Default constructor for Circle class
	Circle(){
		radius = 1;
	}
	
//	Parameterized constructor for Circle class
	Circle(int rad1){
		radius = rad1;
	}
	
//	Method to calculate circumference of circle
	int getCircumference() {
		return (int) (2*Math.PI*radius);
	}
	
	public static void main(String[] args) {
//		Object creation for Default Constructor of Circle class 
		Circle circle = new Circle();
		System.out.println(circle.getCircumference());
		
//		Object creation for Parameterized Constructor of Circle class
		Circle circle1 = new Circle(5);
		System.out.println(circle1.getCircumference());
	}
}
