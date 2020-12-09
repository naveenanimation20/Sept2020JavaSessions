package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser.....");
		checkBrowserVersion();
		checkBrowserOSVersion();
		interactWithOSServices();
		checkRAMSpace();
		System.out.println("chrome browser is launched....");

	}

	public void checkBrowserVersion() {
		System.out.println("checkBrowserVersion...");
	}

	public void checkBrowserOSVersion() {
		System.out.println("checkBrowser OS Version...");
	}

	public void interactWithOSServices() {
		System.out.println("checkBrowserVersion...");
	}

	public void checkRAMSpace() {
		System.out.println("check RAM space....");
	}

}
