package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("Hello Testing");

//		try {
//			throw new Exception("Some Exception is coming...");
//		} catch (Exception e) {
//			e.getMessage();
//			e.printStackTrace();
//		}
		
		String s = null;
		
		if(s == null) {
			System.out.println("Bye");
			
			try {
				throw new Exception("Excel Value Exception - value is null");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
