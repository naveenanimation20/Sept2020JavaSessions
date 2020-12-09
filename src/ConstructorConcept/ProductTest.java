package ConstructorConcept;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {

		Product p1 = new Product("Nike Shoes", 5000);
		System.out.println(p1.name + " " + p1.price + " " + p1.color + " " + p1.sellerList);

		ArrayList<String> appleSellerList = new ArrayList<String>();
		appleSellerList.add("Neon Enterprise Ltd");
		appleSellerList.add("Xeon Computers");
		appleSellerList.add("Ali IT software");

		Product p2 = new Product("Apple MacbookPro", 2.3, "White", appleSellerList);
		System.out.println(p2.name + " " + p2.price + " " + p2.color + " " + p2.sellerList);
		System.out.println(p2.sellerList.get(0));

		for (String ele : p2.sellerList) {
			System.out.println(ele);
		}

	}

}
