package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url= prop.getProperty("qaurl");
		String browser_prop = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		
		//result = testcondition? value1 : value2
	String browser =	browser_maven!=null ? browser_maven : browser_prop;
	
			if(driver== null) {
				
				if(browser.equalsIgnoreCase("edge"))
				{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//msedgedriver.exe");
			driver =new EdgeDriver();
				}
				else if (browser.equalsIgnoreCase("chrome"))
				{
					//chrome code
				}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			}
			return driver;
	}
	

}
