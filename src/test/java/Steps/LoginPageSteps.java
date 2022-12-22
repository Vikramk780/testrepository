package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import qa.driverfactory.DriverFactory;
import qa.pages.LoginPage;

public class LoginPageSteps {

	
	WebDriver driver;
	DriverFactory driverFactory;
	LoginPage loginPage;
	
	@Given("user enters orange url as {string}")
	public void user_enters_orange_url_as(String string) {
		  driverFactory = new DriverFactory();
		  driver=driverFactory.init_driver("chrome");
		  driver.get(string);
	}

	@When("User enters username as {string} and password as {string} and cliks on login button")
	public void user_enters_username_as_and_password_as_and_cliks_on_login_button(String string, String string2) {
	 
	   loginPage = new LoginPage(driver);
	   loginPage.doLogin(string, string2);
	   
	   
	   
	   
	}
}
