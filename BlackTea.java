package task_10_guvi;

public class BlackTea extends Tea {

//	Assigning values for the data members, by overriding the method prepareTea
	String prepareTea() {
		brewingTime = 5;
		tea = "Basic Black Tea - Hot Water, Black Leaves";
		return tea;
	}

	public static void main(String[] args) {
//		Object Creation for BlackTea without adding Milk and Sugar
		BlackTea blackTea = new BlackTea();
		System.out.println(blackTea.prepareTea() + " | Brewing Time - " + blackTea.brewingTime);
		
//		Object Creation for BlackTea with only Milk
		BlackTea blackTea1 = new BlackTea();
		System.out.println(blackTea1.prepareTea() + blackTea1.addMilk() + " | Brewing Time - " + blackTea1.brewingTime);
		
//		Object Creation for BlackTea with only Sugar
		BlackTea blackTea2 = new BlackTea();
		System.out.println(blackTea2.prepareTea() + blackTea2.addMilk() + blackTea2.addSugar() + " | Brewing Time - " + blackTea2.brewingTime);
		
//		Object Creation for BlackTea with Milk and Sugar
		BlackTea blackTea3 = new BlackTea();
		System.out.println(blackTea3.prepareTea() + blackTea3.addMilk() + blackTea3.addSugar() + " | Brewing Time - " + blackTea3.brewingTime);

	}

}
