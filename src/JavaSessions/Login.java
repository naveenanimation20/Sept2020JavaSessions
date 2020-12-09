package JavaSessions;


public class Login {

	public static void main(String[] args) {

		Login l = new Login();
		l.login();
		l.search();

	}

	public void login() {
		profile();
		test();
	}

	public void profile() {
		search();
		addToCart();
		payment();
	}

	public void search() {
		addToCart();
	}

	public void addToCart() {
		payment();
	}

	public void payment() {

	}

	public void getOrder() {

	}

	public static void test() {
		price();
	}

	public static void price() {
	}

}
