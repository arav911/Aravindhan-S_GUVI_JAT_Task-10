package task_10_guvi;

public class GreenTea extends Tea {
	
//	Assigning values for the data members, by overriding the method prepareTea
	String prepareTea() {
		brewingTime = 3;
		tea = "Basic Green Tea - Hot Water, Green Leaves";
		return tea;
	}
	public static void main(String[] args) {
//		Object Creation for GreenTea without adding Milk and Sugar
		GreenTea greenTea = new GreenTea();
		System.out.println(greenTea.prepareTea() + " | Brewing Time - "+greenTea.brewingTime);

//		Object Creation for GreenTea with only Milk
		GreenTea greenTea1 = new GreenTea();
		System.out.println(greenTea1.prepareTea() + greenTea1.addMilk() + " | Brewing Time - "+greenTea1.brewingTime);
		
//		Object Creation for GreenTea with only Sugar
		GreenTea greenTea2 = new GreenTea();
		System.out.println(greenTea2.prepareTea() + greenTea2.addSugar() +  " | Brewing Time - "+greenTea2.brewingTime);
		
//		Object Creation for GreenTea with Milk and Sugar
		GreenTea greenTea3 = new GreenTea();
		System.out.println(greenTea3.prepareTea() + greenTea3.addMilk() + greenTea3.addSugar() +  " | Brewing Time - "+greenTea3.brewingTime);

	}

}
