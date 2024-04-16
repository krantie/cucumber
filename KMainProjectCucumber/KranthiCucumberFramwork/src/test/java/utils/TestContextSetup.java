package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String pname;
	public PageObjectManager pageobjectmanager;
	public TestBase testBase;
	public genericUtils genericutils;
	
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageobjectmanager= new PageObjectManager(testBase.WebDriverManager());
		genericutils = new genericUtils(testBase.WebDriverManager());
	}
}
