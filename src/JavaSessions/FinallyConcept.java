package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {

		// associated with try-catch
		// finally is block - it will be executed all the time doesnt matter
		// exception is coming or not

		int p = 10;

		try {
			System.out.println("this is before exception...");
			System.out.println("DB Connection -- trying to stablish");
			System.out.println("DB Connection -- is DONE");

			int z = p / 0;
		} catch (ArithmeticException e) {
			System.out.println("some exceptpn is coming....");
		} finally {
			System.out.println("executing finally block....");
			System.out.println("flush / close the connection....");
		}
		
		
		int m = getMarks("Ali");
		System.out.println(m);
	}
	
	

	public static int getMarks(String name) {

		try {
			if (name.equals("Neha")) {
				return 100;
			} else if (name.equals("Sheetal")) {
				return 90;
			} else if (name.equals("Ali")) {
				int i = 9/0;
				return 95;
			} else {
				return -1;
			}

		} catch (Exception e) {
			return -2;
		}
		
		finally {
			System.out.println("Bye...");
			//return -3;
		}

	}

}
