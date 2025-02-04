package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing {
	
	public WebDriver driver;
	
	public Landing(WebDriver driver) {
		
		this.driver =driver;
	}
	
	
	
	By Search = By.xpath("//input[@type='search']");
	By ProductName	= By.xpath("//h4[normalize-space()='Tomato - 1 Kg']");
	By Topdeals = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addtoCart = By.cssSelector("a.product-action button");
	
	
	public void searchItem(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	public String getProductName()
	{
		return driver.findElement(ProductName).getText();
	}
	
	public void incrementQuantity(int quantity)
	{
		int i = quantity;
		while(i>0)
		{	
			driver.findElement(increment).click();
			i--;
		}
	}
	public void addtocart()
	{
	driver.findElement(addtoCart).click();
	}
	
	public void Topdeals()
	{
		driver.findElement(Topdeals).click();
	}
	public String getTitleofLandingPage()
	{
		return driver.getTitle();
	}
	
}
