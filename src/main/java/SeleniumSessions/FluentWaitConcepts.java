package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcepts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		ElementsUtility element = new ElementsUtility(driver);
		
		By fullName = By.cssSelector("#Form_getForm_Name");
		By businessMail = By.cssSelector("#Form_getForm_Email");
		
		Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
										.withTimeout(Duration.ofSeconds(10))
										.pollingEvery(Duration.ofSeconds(2))
											.ignoring(NoSuchElementException.class)
											.ignoring(StaleElementReferenceException.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(fullName)).sendKeys("Naveen Kumar");
		
		element.waitWithFluentWait(businessMail, 10, 1).sendKeys("naveen@cicdtest.com");
		
		
	}

}
