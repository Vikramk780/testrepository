package Steps;

import io.cucumber.java.en.Then;
import qa.driverfactory.DriverFactory;
import qa.pages.HomePage;
import qa.pages.RecruitmentPage;

public class RecruitmentPageSteps {
	RecruitmentPage recruitmenetpage;
	HomePage homePage;
	
	
	@Then("user goes to recruitment page")
	public void user_goes_to_recruitment_page() {
		
		homePage = new HomePage(DriverFactory.getDriver());
		recruitmenetpage=homePage.clickonRecruitMneu();
	 
	   recruitmenetpage.addrecruitment();
	   
	}

	@Then("create recruitement")
	public void create_recruitement() {
	    
	}
}
