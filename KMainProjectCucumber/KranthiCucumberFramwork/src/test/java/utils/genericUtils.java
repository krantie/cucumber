package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {
	
	public WebDriver driver;
	
	public genericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void SwitchWindowToChild() throws InterruptedException
	{
		Set <String> s1= driver.getWindowHandles();
		Iterator <String> i1=s1.iterator();
		String Pwindow= i1.next();
		String CWindow = i1.next();
		System.out.println("up to here completed");
		driver.switchTo().window(CWindow);
		Thread.sleep(4000);
	}
	

}
