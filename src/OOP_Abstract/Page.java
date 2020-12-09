package OOP_Abstract;

public abstract class Page {
	
	//can not create the object of Abstract class
	
	//may have some abstract methods:
	
	//can I create the constructor of page class? -- YES
	public Page() {
		System.out.println("Page Const....");
	}
	
	public abstract void title();//abstract methods
	public abstract void url();
	
	//can have non abstract method? -->yes
	public void timeOut() {
		System.out.println("page -- time out");
	}
	
	public static void logo() {
		System.out.println("PAGE -- LOGO");
	}
	
	
	
	

}
