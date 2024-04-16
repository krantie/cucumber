package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public Landing landing;
	public Secondpage secondpage;
	public checkoutpage CheckoutPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public Landing getlandingpage()
	{
		landing = new Landing(driver);
		return landing;
	}
	
	public Secondpage getsecondpage()
	{
		secondpage = new Secondpage(driver);
		return secondpage;
	}
	

	public checkoutpage getcheckoutpage()
	{
		CheckoutPage = new checkoutpage(driver);
		return CheckoutPage;
	}
	
}
