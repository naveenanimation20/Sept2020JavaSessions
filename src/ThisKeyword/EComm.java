package ThisKeyword;

public class EComm {
	
	//Builder Pattern using this keyword

	public EComm login(String un, String pwd) {
		System.out.println("login with :" + un + " :" +pwd);
		return this;
	}

	public EComm search(String productName) {
		System.out.println("search with : " + productName);
		return this;
	}

	public EComm search(String productName, int price) {
		System.out.println("search with : " + productName + " price: " + price);
		return this;
	}

	public EComm addToCart(String productName) {
		System.out.println("Adding to cart: " + productName);
		return this;
	}

	public EComm checkout(String productName) {
		System.out.println("checkout this product: " + productName);
		return this;
	}

	public EComm doPayment(String CC, String pwd) {
		System.out.println("payment is done using : " + CC + " pwd " + pwd);
		return this;
	}

	public EComm generateOrder(String productName) {
		System.out.println("Your order id is : " + 12345 + " for this product " + productName);
		return this;
	}

}
