package stepDefinations;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	
	@Given ("user is on netbanking login page")
	
	public void netbanking_Loginpage()
	{
		System.out.println("user is on netbanking login page got created");
	}
	
//	@When("user login into application with {string} and password is {string}")
//	public void user_login_into_application_with_and_password_is(String Uname, String PWRD) {
//		
//		System.out.println( Uname + "and password is "+ PWRD);
//	}

	
//IMP QUestion for Interview 	
// we can use this as regular expression for any string or interger to use(it is same as above,only ^ $ added and (.+) 
//	regular expression added
	
	@When("^user login into application with (.+) and password is (.+)$")
	public void user_login_into_application_with_and_password_is(String Uname, String PWRD) {
		
		System.out.println( Uname + "and password is "+ PWRD);
	}
	@Then ("user need to be enter in homepage")
	public void User_enter_in_homepage()
	{
		System.out.println("user entered in home page after login");
	}
	
	@Then ("user need to see logo of the page")
	
	public void UserNeed_to_see_Logo()
	{
		System.out.println("user can able to see Logo as well");
	}
	
	

	
	@Given("user is on netbanking signup page")
	public void user_is_on_netbanking_signup_page() {
	 
		System.out.println("user in netbanking sign up page");
	}

	// Data driven step defination method 
	
	@When("user filling details for sign up")
	public void user_filling_details_for_sign_up(List<String> data ) {
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
	
	@Given ("setup the Database connection first")
	public void setup_database() {
		System.out.println("****************************");
		System.out.println("database setup has to do");
	}
		
	@When ("Launch the Chrome Browser")
	public void Launch_Browser(){
		System.out.println("****************************");
		System.out.println("Browser Got Launched");
	}
		
	@When ("Open Axis Bank application Homepage")
		public void Open_AXIS_bank_Website(){
			System.out.println("****************************");
			System.out.println("AXIS Bank website got openened");
		
	}
		
	
		
		
	
	
}
