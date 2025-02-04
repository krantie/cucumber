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
import pageObjects.checkoutpage;
import utils.TestContextSetup;

public class CheckoutpageStepDefinition {

	public WebDriver driver;
	public String pname;
	TestContextSetup testcontextsetup;
	public checkoutpage CheckoutPage;
	
	public CheckoutpageStepDefinition(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup = testcontextsetup;
		this.CheckoutPage = testcontextsetup.pageobjectmanager.getcheckoutpage();
	}
	
	@Then("user has ability to enter promo code place the order")
	public void user_prmo_code()
	{
		
		Assert.assertTrue(CheckoutPage.verifyPromoBtn());
		Assert.assertTrue(CheckoutPage.verifyPlaceOrder());
		
	}
	
	@Then("^user proceeds to checkout and validate the (.+) in checkout page$")
	public void user_proceeds_to_Checkout() throws InterruptedException
	{
		CheckoutPage.CheckOutItems();

	}

	
}
