package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver ldriver;

WaitHelper waitHelper;

@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/span[1]") WebElement timemenu;
@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]") WebElement recruitMenu;
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waitHelper =new WaitHelper(ldriver);
		
	}
	
	public String verifyTitleofHomePage() {
		String titlename =ldriver.getTitle();
		 
	
		return titlename;
		
		
	}
	
	public TimePage gotoTimePage() throws InterruptedException {
		Thread.sleep(2000);
		waitHelper.forThisElementWait(timemenu, 10).click();
//		timemenu.click();
		
		return new TimePage(ldriver);
	}
	
	public RecruitmentPage clickonRecruitMneu() {
		waitHelper.forThisElementWait(recruitMenu, 4).click();
		return new RecruitmentPage(ldriver);
	}
}
