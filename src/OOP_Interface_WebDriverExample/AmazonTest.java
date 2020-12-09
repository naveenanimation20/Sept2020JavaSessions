package OOP_Interface_WebDriverExample;

public class AmazonTest {

	public static void main(String[] args) {

		WebDriver driver = null;
		
		//cross browser testing using top casting
		String browser = "chrome";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Please pass the correct browser name...." + browser);
		}

		driver.get("http://www.amazon.com");

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement("username");
		driver.sendKeys("admin@gmail.com");

		driver.findElement("password");
		driver.sendKeys("admin@123");

		driver.findElement("login button");
		driver.click();

	}

}
