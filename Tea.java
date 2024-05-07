package task_10_guvi;

public class Tea {
//	Declaring data members for tea and brewingTime
	String tea;
	int brewingTime;

//	Assigning values for the data members
	String prepareTea() {
		brewingTime = 3;
		tea = "Basic Tea - Hot Water, Tea Leaves ";
		System.out.println("Basic Tea Prepared with Hot Water and Tea Leaves");
		return tea;
	}
//	Adding Milk to the Tea, if this method get called
	String addMilk() {
		tea = " + Milk";
		System.out.println("Milk added successfully to Basic Tea");
		return tea;
	}
//	Adding Sugar to the Tea, if this method get called
	String addSugar() {
		tea = " + Sugar";
		System.out.println("Sugar added successfully to Basic Tea");
		return tea;
	}
}
