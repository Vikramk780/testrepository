package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/resources/Features"},
		glue = {"Steps"},
		dryRun =false,
		monochrome = true
		)
public class RunIT extends AbstractTestNGCucumberTests {

	
	
}