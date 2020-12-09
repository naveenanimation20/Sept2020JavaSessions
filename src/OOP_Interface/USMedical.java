package OOP_Interface;

public interface USMedical extends WHO{
	
	int admission_fee = 50;

	// No method body
	// only method declaration -- method prototype
	// can not create the Object of Interface
	//interface vars are static and final by default

	public void orthoServices();//abstract method

	public void physioServices();

	public void emergencyServices();
	
	public void audiologyServices();
	
	
	//After JDK 1.8:
	//1. we can have static methods with method body:
	public static void minFee() {
		System.out.println("min fee is 10 USD");
	}
	
	//2. we can have default method with body:
	default void bloodBank() {
		System.out.println("US Medical- blood bank");
	}
	

}
