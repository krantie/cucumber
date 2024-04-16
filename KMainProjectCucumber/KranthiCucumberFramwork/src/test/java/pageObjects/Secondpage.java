package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Secondpage {
	
	public WebDriver driver;
	
	public Secondpage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	
	
	By Search = By.xpath("//input[@type='search']");
	By product = By.cssSelector("tr td:nth-child(1)");
	
	public void searchItem(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	public String product()
	{
		return driver.findElement(product).getText();
	}

}
