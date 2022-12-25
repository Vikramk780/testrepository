package qa.pages;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimePage {

	WebDriver ldriver;
	WaitHelper waitHelper;
	
	@FindBy(xpath="//span[normalize-space()='Attendance']") WebElement viewbtn;
	
	@FindBy(xpath="//a[normalize-space()='My Records']") WebElement textoftimesheet;
	
	
	
	public TimePage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(ldriver, this);
		waitHelper =new WaitHelper(ldriver);
		
	}
	
	
	public void verifyTimeSheetForLisa() {
		waitHelper.forThisElementWait(viewbtn, 3).click();
		
//		JavascriptExecutor js =(JavascriptExecutor)ldriver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight))");
//		viewbtn.click();
	}
	
	public String verifyTimesheetname() {
		return waitHelper.forThisElementWait(textoftimesheet,10).getText();
		
		
 	
	}
}
