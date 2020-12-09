package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		int k = 10/0;

		try {
			System.out.println("Hello");
			int i = 9/3;
			System.out.println("testing");
			System.out.println("testing");
			System.out.println("testing");

		}
		catch(ArithmeticException e) {
			System.out.println("some exception is coming...bye!!");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
		System.out.println("Hi");
		System.out.println("Hi");

		
		
		
	}

}
