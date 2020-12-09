package JavaSessions;

public class FinalizeMethodConcept {
	int age;

	public static void main(String[] args) {
		
		String s = new String("Naveen");

		FinalizeMethodConcept obj = new FinalizeMethodConcept();
		obj = null;
		s = null;

		System.gc();
		System.out.println("Done!!!");

	}

	@Override
	public void finalize() {
		System.out.println("this is my finalize method....");
	}

}
