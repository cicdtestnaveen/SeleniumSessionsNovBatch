package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		By username = By.cssSelector("#username");
		By password = By.cssSelector("#password");
		
		waitForElementPresenceOnDOM(username, 10).sendKeys("Naveen");
		
		
	}
	
	public static WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 *  This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresenceOnDOM(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element, 
	 * known to be present on the DOM of a page, isvisible. 
	 * Visibility means that the element is not only displayed 
	 * but also has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementIsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));
	}
	
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForAllElementsPresenceOnDOM(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public static void waitToClickWebElement (By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	public static void actionsWaitToClickWebElement (By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	

}
