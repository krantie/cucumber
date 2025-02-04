package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage {
	
	public WebDriver driver;
	
	public checkoutpage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	By cartBag = By.xpath("//img[@alt='Cart']");
	By checkoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	
	
	
	public void CheckOutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();	
	}

	public Boolean verifyPromoBtn()
	{
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean verifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
	
}
