package task_10_guvi;

public class HerbalTea extends Tea {

//	Assigning values for the data members, by overriding the method prepareTea
	String prepareTea() {
		brewingTime = 4;
		tea = "Basic Herbal Tea - Hot Water, Herbal Leaves";
		return tea;
	}
	public static void main(String[] args) {
//		Object Creation for HerbalTea without adding Milk and Sugar
		HerbalTea herbalTea = new HerbalTea();
		System.out.println(herbalTea.prepareTea() + " | Brewing Time - "+herbalTea.brewingTime);
		
//		Object Creation for HerbalTea with only Milk
		HerbalTea herbalTea1 = new HerbalTea();
		System.out.println(herbalTea1.prepareTea() + herbalTea1.addMilk() + " | Brewing Time - "+herbalTea1.brewingTime);
		
//		Object Creation for HerbalTea with only Sugar
		HerbalTea herbalTea2 = new HerbalTea();
		System.out.println(herbalTea2.prepareTea() + herbalTea2.addMilk() + herbalTea2.addSugar() +  " | Brewing Time - "+herbalTea2.brewingTime);
		
//		Object Creation for HerbalTea with Milk and Sugar
		HerbalTea herbalTea3 = new HerbalTea();
		System.out.println(herbalTea3.prepareTea() + herbalTea3.addMilk() + herbalTea3.addSugar() +  " | Brewing Time - "+herbalTea3.brewingTime);

	}

}
