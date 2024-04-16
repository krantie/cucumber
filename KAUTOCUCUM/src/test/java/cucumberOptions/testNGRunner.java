package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




// Before -> Background-> Sceanrio -> After

												// examples of tags = @Smoketest and @RegressionTest, not @RegressionTest
@CucumberOptions (features ="src/test/java/features",glue ="stepDefinations",monochrome =true,
tags="@SmokeTest or @RegressionTest", plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class testNGRunner extends AbstractTestNGCucumberTests{

	
	
}
