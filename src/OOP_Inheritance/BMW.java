package OOP_Inheritance;

public class BMW extends Car{	
	
	//Method Overriding:
	//is a poly+morphism ==> RunTime PolyMorphism
	//when you have a method in parent class with the same name and same number of params
	//also available in child class -- is called Method Overriding
	//static method can not be overridden
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}
	
	@Override
	public String price() {
		System.out.println("Car -- price");
		return "BMW price return";
	}
	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	
	public static void wheels() {
		System.out.println("BMW -- Wheels");
	}
	

}
