package OOP_Encapsulation;

public class EmpTest {
	
	
	public static void main(String a[]){
		Employee e1 = new Employee();
		
		e1.setName("Tom");
		System.out.println(e1.getName());
		
		e1.setAge(30);
		System.out.println(e1.getAge());
		
		Company c1 = new Company();
		c1.setName("IBM");
		System.out.println(c1.getName());
		
		c1.getPolicyInfo();
		
		
		
		
	}
	
	
	

}
