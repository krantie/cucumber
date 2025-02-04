package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
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
import utils.TestContextSetup;

public class LandingStepDefinition {

	public WebDriver driver;
	public String pname;
	TestContextSetup testcontextsetup;
	Landing landingpage;
	
	public LandingStepDefinition(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup = testcontextsetup;
		this.landingpage= testcontextsetup.pageobjectmanager.getlandingpage();
	}
	
	@Given("user is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() throws IOException {	
	//	testcontextsetup.testBase.WebDriverManager();
		
		Assert.assertTrue(landingpage.getTitleofLandingPage().contains("GreenKart"));
	}
	
	
	@When("^user search with Shortname (.+) and extracted actual name of product$")
	public void user_search_with_shortname_and_extracted_actual_name_of_product(String SName) throws InterruptedException {
		
		
		landingpage.searchItem(SName);
		testcontextsetup.pname=  landingpage.getProductName().split("-")[0].trim();
	Thread.sleep(2000);
			  System.out.println(pname + "is extended from home page");
			 	
	}
	
	@When ("Added {string} items of the selected product to cart")
	public void added_items_prod(String quantity)
	{
	landingpage.incrementQuantity(Integer.parseInt(quantity));	
	landingpage.addtocart();
	}

}
