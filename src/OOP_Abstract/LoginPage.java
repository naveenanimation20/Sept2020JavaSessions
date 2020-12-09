package OOP_Abstract;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("LP -- const...");
	}

	@Override
	public void title() {
		System.out.println("LP - Title");
	}

	@Override
	public void url() {
		System.out.println("LP - URL");
	}
	
	public void forgotPwd() {
		System.out.println("LP - ForgotPWD");
	}
	
	
	
	

}
