package JavaSessions;

public class MainMethodOverloading {

	public static void main(String a[]) {
		System.out.println("Hello Naveen");

		main(10, 20);
		
		login(9999999, 999);
	}

	public static void main(int i) {
		System.out.println(i);
	}

	public static void main(int i, int k) {
		System.out.println(i + k);
	}

	public static void main(int i, String p) {
		System.out.println(i + p);
	}

	// can we overload static methods?
	public static void login() {

	}

	public static void login(long ph) {

	}
	
	public static void login(long ph, int otp) {

	}

}
