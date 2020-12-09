package JavaSessions;

import java.util.ArrayList;

public class Employee {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		String assets_sheetal[] = e1.getEmployeeAssets("Naveen");
		
		System.out.println("total assets: " + assets_sheetal.length);

		for (String s : assets_sheetal) {
			System.out.println(s);
		}
		
		System.out.println("------");
		
		ArrayList<String> orderList_Tom = e1.getEmpOrders("Naveen");
		System.out.println("total orders: " + orderList_Tom.size());
		for(String s : orderList_Tom){
			System.out.println(s);
		}

	}

	// WAM: where we have to pass the emp name and return the employee assets
	// array

	public String[] getEmployeeAssets(String empName) {
		System.out.println("emp name is : " + empName);
		String asset[] = new String[4];

		if (empName.equals("Sheetal")) {
			asset[0] = "Macbook Pro";
			asset[1] = "Mouse";
			asset[2] = "Keyboard";
			asset[3] = "iPhone X";
		}

		else if (empName.equals("Kiran")) {
			asset[0] = "Windows Laptop";
			asset[1] = "Mouse";
			asset[2] = "Keyboard";
			asset[3] = "headphone";
		}
		
		else{
			System.out.println("this employee " + empName + " is not found, please pass the correct name.....");
			return null;
		}

		return asset;

	}

	public ArrayList<String> getEmpOrders(String empName) {

		System.out.println("getEmpOrders for " + empName);

		ArrayList<String> orderList = new ArrayList<String>();

		if (empName.equals("Tom")) {
			orderList.add("iPhone");
			orderList.add("Laptop");
			orderList.add("Tshirt");
			orderList.add("Shoes");
		}

		else if (empName.equals("Steve")) {
			orderList.add("iPhone");
			orderList.add("Laptop");
		}
		
		else{
			System.out.println("this employee " + empName + " is not found, please pass the correct name.....");
		}

		return orderList;
	}

}
