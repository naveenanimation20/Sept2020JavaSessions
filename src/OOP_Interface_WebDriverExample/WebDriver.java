package OOP_Interface_WebDriverExample;

public interface WebDriver extends SearchContext{
	
	
	public void get(String url);
	
	public String getTitle();
	
	public void click();
	
	public void sendKeys(String value);
	
	public void quit();
	
	
	

}
