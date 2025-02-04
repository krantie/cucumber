package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Landing;
import pageObjects.PageObjectManager;
import pageObjects.Secondpage;
import utils.TestContextSetup;

public class SecondpageStepDefinition {

	public String Offerpageproduct;
	TestContextSetup testcontextsetup;
	PageObjectManager pageobjectmanager;
	
public SecondpageStepDefinition(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup = testcontextsetup;
	}
	
	@Then("^user searched for (.+) shortname in offers page to check$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String SName) throws InterruptedException {
		
		
		
		switchToSecondpage();
		Secondpage secondpage = testcontextsetup.pageobjectmanager.getsecondpage();
		secondpage.searchItem(SName);
		
		Thread.sleep(2000);
		Offerpageproduct = secondpage.product();
		System.out.println(Offerpageproduct);
	}
	
	
	public void switchToSecondpage() throws InterruptedException
	{
		//window handles
		
		//If switched to second page already skip this method with below code
		
	//	if(testcontextsetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
				
				Landing landingpage= testcontextsetup.pageobjectmanager.getlandingpage();
				landingpage.Topdeals();
				testcontextsetup.genericutils.SwitchWindowToChild();
				
	
	}
	
	
	@Then("if product equal with both pages")
	public void search_both_areEqual()
	{
		Assert.assertEquals(Offerpageproduct,testcontextsetup.pname);
	}

}
