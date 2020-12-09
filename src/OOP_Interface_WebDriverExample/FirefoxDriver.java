package OOP_Interface_WebDriverExample;

public class FirefoxDriver implements WebDriver{
	
	
	public FirefoxDriver() {
		System.out.println("Launch Firefox...");
	}
	

	@Override
	public void findElement(String locator) {
		System.out.println("find the element using : " + locator);
	}

	@Override
	public void get(String url) {
		System.out.println("launch url with : " + url);
	}

	@Override
	public String getTitle() {

		return "title of the page";
	}

	@Override
	public void click() {
		System.out.println("click on the element");
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("send the value : " + value);
	}

	@Override
	public void quit() {
		System.out.println("quit browser");
	}

}
