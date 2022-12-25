package qa.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitHelper {

	WebDriver driver;
	
	public WaitHelper(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement forThisElementWait(WebElement ele,long secondss) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(secondss)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ele;
	}
}
