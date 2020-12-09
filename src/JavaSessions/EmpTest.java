package JavaSessions;

public class EmpTest {
	
	String name;
	int age;
	boolean status;
	double salary;
	static String lastName;

	public static void main(String[] args) {
		
		final int total = 100;
		System.out.println(total);

		EmpTest e1 = new EmpTest();
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.status);
		System.out.println(e1.salary);
		
		System.out.println(lastName);
		
		final int days = 7;
		System.out.println(100 * days * 200);
		
	}

}
