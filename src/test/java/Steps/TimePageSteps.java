package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;

import qa.driverfactory.DriverFactory;
import qa.pages.HomePage;
import qa.pages.TimePage;

public class TimePageSteps {

	WebDriver ldriver;
	HomePage homePage;
	TimePage timePage;
	
	@Then("user goes to time page")
	public void user_goes_to_time_page() throws InterruptedException {
		ldriver = DriverFactory.getDriver();
		
		homePage = new HomePage(ldriver);
		timePage=homePage.gotoTimePage();
	   
	   
	}

	@Then("user clicks on lisauser and view record")
	public void user_clicks_on_lisauser_and_view_record() {
		timePage.verifyTimeSheetForLisa();
	   
	}

	@Then("verifies timesheet as {string}")
	public void verifies_timesheet_as(String title) {
		
		Assert.assertEquals(title, timePage.verifyTimesheetname());
		System.out.println(timePage.verifyTimesheetname());
		System.out.println(title);
	}
}
