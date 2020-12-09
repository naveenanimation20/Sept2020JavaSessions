package JavaSessions;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.test();
		obj.test(10);
		obj.test(20, "naveen");

	}
	
	//Method Overloading: is part of Polymorphism ==> poly  + morphism
	//Within the same class, when you have different methods with:
	//1. same name
	//2. having different parameters
	//3. the sequence of the params is different
	
	//Compile time Polymorphism

	public void test() {
		System.out.println("test method...");
	}

	public void test(int i) {
		System.out.println(i);
	}
	
	public void test(int k, int p) {
		System.out.println(k+""+p);
	}

	public void test(int k, String p) {
		System.out.println(k+p);
		
	}
	
	public void test(String p, int k) {
		System.out.println(p+k);
	}
	
}
