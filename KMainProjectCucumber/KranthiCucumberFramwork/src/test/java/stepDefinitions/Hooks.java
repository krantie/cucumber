package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
	}

	
	@After
	public void AfterScenario() throws IOException
	{
		testcontextsetup.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void Addscreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = testcontextsetup.testBase.WebDriverManager();
	
		if(scenario.isFailed())
				{
		File sourcePath = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
				}
		
	}
}
