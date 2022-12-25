package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

	WebDriver ldriver;
	WaitHelper waitHelper;
	
@FindBy(xpath="//button[normalize-space()='Add']") WebElement addbtn;
	
	
	
	public RecruitmentPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waitHelper = new WaitHelper(ldriver);
	}
	
	
	
	
	public void addrecruitment() {
		waitHelper.forThisElementWait(addbtn, 10).click();
	}
}
