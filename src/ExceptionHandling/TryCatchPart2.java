package ExceptionHandling;

public class TryCatchPart2 {

	String name = "Tom";

	public static void main(String[] args) {

		System.out.println("Hello Testing");

		TryCatchPart2 obj = new TryCatchPart2();

		obj = null;

		try {
			int i = 9/3;
			System.out.println(obj.name);
		} 
		catch (NullPointerException e) {
			System.out.println("NPE is coming....");
		}
		catch(ArithmeticException e) {
			System.out.println("AME is coming");
			e.printStackTrace();
		}
		
		System.out.println("Bye!!");
		
		
		

	}

}
