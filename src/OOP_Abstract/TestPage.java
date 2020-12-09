package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		
		lp.title();
		lp.url();
		lp.timeOut();
		Page.logo();
		lp.forgotPwd();
		
		//top casting:
		Page p = new LoginPage();
		p.title();
		p.url();
		p.timeOut();
	
		
		
		
		
		
	}

}
