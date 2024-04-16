package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	
	@Before("@NetBanking")
	public void netbankingsetup()
	{
		System.out.println("************************");
		System.out.println("netbanking logins created");
	}
	
	@Before("@Mortgage")
	public void mortgageLogin()
	{
		System.out.println("************************");
		System.out.println("mortgage logins created");
	}
	
	@After()
	public void teardown()
	{
		System.out.println("clear the history");
	}

}
