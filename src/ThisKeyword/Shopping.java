package ThisKeyword;

public class Shopping {

	public static void main(String[] args) {

		EComm e1 = new EComm();
		
		e1
		.login("naveen@gmail.com", "naveen@123")
		.search("Apple MackBook", 2000)
		.addToCart("Apple MacBook")
		.checkout("Apple MacBook")
		.doPayment("1234 1222 4444 3333", "Testing@1234")
		.generateOrder("Apple MacBook");
		
		System.out.println("-----------");
		
		e1
		.login("naveen@gmail.com", "naveen@123")
		.addToCart("Nike shoes")
		.doPayment("1234 1222 4444 3333", "Testing@1234")
		.generateOrder("Nike shoes");
		
		
		System.out.println("-----------");

		
		e1
		.addToCart("Nike shoes")
		.doPayment("1234 1222 4444 3333", "Testing@1234")
		.generateOrder("Nike shoes");
		
		
		
	}

}
