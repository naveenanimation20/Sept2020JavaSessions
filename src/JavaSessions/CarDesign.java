package JavaSessions;

public class CarDesign {

	String name;
	int price;
	String model;
	static int wheels = 4;

	public void start() {
		System.out.println("car start");
	}

	public void stop() {
		System.out.println("car stop");
	}

	public static void run() {
		System.out.println("car run");
	}

	public static void main(String[] args) {		
		
		// how to call static vars and methods:
		// 1. call them directly. no need to create the object
		//wheels = 4;
		System.out.println(wheels);
		run();

		// 2. call by class name:
		//CarDesign.wheels = 5;
		System.out.println(wheels);

		CarDesign.run();
		
		// how to call non static vars and methods:
		CarDesign c1 = new CarDesign();
		c1.name = "BMW";
		c1.price = 80;
		c1.model = "720d";
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + CarDesign.wheels);
		
		
		
//		c1.name = "BMW";
//		c1.wheels = 5;
//		System.out.println(c1.wheels);
//		
//		c1.start();
//		c1.stop();
//		c1.run();
		
		
		
		
		

	}

}
