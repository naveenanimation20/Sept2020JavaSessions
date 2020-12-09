package JavaSessions;

public class FunctionsInJava {
	
	//function can not be created inside a function
	

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.printName();
		obj.total();
		int s = obj.add();
		System.out.println(s+100+20);
		
		System.out.println(obj.add());
		
		String n = obj.getTrainerName();
		System.out.println("trainer name is: " + n);
		
		int s1 = obj.getSum(10, 20);
		System.out.println(s1+5+100);
		
		int s2 = obj.getSum(40, 90);
		System.out.println(s2);
		
		String capName = obj.getCapitalName("India");
		System.out.println(capName);
		
		capName = obj.getCapitalName("Russia");
		System.out.println(capName);
		
		int m = obj.getStudnetMarks("Tom");
		System.out.println(m);
		
		if(obj.launchBrowser("IE")){
			System.out.println("start my test casessss");
		}
		else{
			System.out.println("Sorry there is no browser.....");
		}
	}
	
	//1. no input and no return
	//void -- no return (can not return any value)
	public void test(){
		System.out.println("test method...");
	}
	
	public void printName(){
		System.out.println("naveen");
	}
	
	public void total(){
		System.out.println("total method");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	//2. no input and some return:
	public int add(){
		System.out.println("add method");
		int x = 100;
		int y = 200;
		int z = x+y;//300
		
		return z;
	}
	
	public String getTrainerName(){
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}
	
	//3. some input and some return:
	
	public int getSum(int a, int b){
		System.out.println("get sum method....");
		int sum = a+b;
		return sum;
	}
	
	//WAP to get the capital name of the country
	public String getCapitalName(String countryName){
		
		System.out.println("getting capital name for " + countryName);
		
		if(countryName.equals("India")){
			return "New Delhi";
		}
		
		else if(countryName.equals("USA")){
			return "Wahington DC";
		}
		
		else if(countryName.equals("UK")){
			return "London";
		}
		
		else{
			System.out.println("this country is not found..." + countryName);
			return null;
		}
		
	}
	
	
	//WAP where i'll be passing a student Name(String) and then function should return the marks(int) of that student.
	public int getStudnetMarks(String name){
		int marks = 0;
		System.out.println("getting the marks for " + name);
		
		if(name.equals("Mohan")){
			marks = 90;
		}
		else if(name.equals("Kanika")){
			marks = 95;
		}
		else if(name.equals("Pratik")){
			marks = 100;
		}
		else if(name.equals("Naveen")){
			marks = 10;
		}
		else{
			System.out.println("student not found :" + name);
			return -1;
		}
		
		return marks;
	}
	
	
	//WAP : where we will pass the browserName, and launch the browser and return boolean:
	
	public boolean launchBrowser(String browserName){
		System.out.println("launching browser: " + browserName);
		boolean flag = false;
		
		switch (browserName) {
		case "chrome":
			System.out.println("launching chrome");
			flag = true;
			break;
		case "firefox":
			System.out.println("launching firefox");
			flag = true;
			break;
		case "safari":
			System.out.println("launching safari");
			flag = true;
			break;

		default:
			System.out.println("browse is not found: " + browserName);
			break;
		}
		
		return flag;
	}
	
	
	
	

}
