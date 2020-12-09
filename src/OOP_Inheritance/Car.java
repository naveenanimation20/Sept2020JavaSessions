package OOP_Inheritance;

public class Car extends Vehicle{

	
	public String price() {
		System.out.println("Car -- price");
		return "Car Price is 10L";
	}
	
	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void wheels() {
		System.out.println("Car -- Wheels");
	}

}
