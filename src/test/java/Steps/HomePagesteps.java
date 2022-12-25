package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;

import qa.driverfactory.DriverFactory;
import qa.pages.HomePage;

public class HomePagesteps {
	DriverFactory driverFactory;
	HomePage homePage;
	WebDriver driver;
	
	@Then("user verifies homepage title as {string}")
	public void user_verifies_homepage_title_as(String string) {
	    driverFactory = new DriverFactory();
	    
	    homePage = new HomePage(DriverFactory.getDriver());
	    String titlename =homePage.verifyTitleofHomePage();
	  
	    Assert.assertEquals(titlename, string);
	}
}
