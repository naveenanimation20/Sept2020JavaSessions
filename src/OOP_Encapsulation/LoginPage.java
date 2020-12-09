package OOP_Encapsulation;

public class LoginPage {

	private String username;
	private String password;
	
	public LoginPage(String username, String password){
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

//	public void setUsername(String username) {
//		this.username = username;
//	}

	public String getPassword() {
		return password;
	}

//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	
	public void doLogin(String un, String pwd){
		System.out.println("login to app with " + un + " and " + pwd);
	}

}
