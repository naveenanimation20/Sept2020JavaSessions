package OOP_Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage("admin@gmail.com", "admin");
		
//		lp.setUsername("cust@gmail.com");
//		lp.setPassword("cust@123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
//		lp.setUsername("seller@gmail.com");
//		lp.setPassword("seller@123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		
		
	}

}
