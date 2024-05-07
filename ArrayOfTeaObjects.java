package task_10_guvi;

public class ArrayOfTeaObjects extends Tea{
	
	//Method Overriding from the Tea class
	String prepareTea() {
		return "Tea Prepared with Hot Water, Tea Leaves, Milk and Sugar";
	}
	public static void main(String[] args) {
//		Array of objects for Tea class initialized with the size of 5
		Tea[] tea = new Tea[5];
		
		tea[0] = new Tea(); //instance for tea class
		System.out.println(tea[0].prepareTea());
		tea[1] = new BlackTea(); // instance for BlackTea class
		System.out.println(tea[1].prepareTea());
		tea[2] = new GreenTea(); // instance for GreenTea class
		System.out.println(tea[2].prepareTea());
		tea[3] = new HerbalTea(); // instance for HerbalTea class
		System.out.println(tea[3].prepareTea());

	}

}
