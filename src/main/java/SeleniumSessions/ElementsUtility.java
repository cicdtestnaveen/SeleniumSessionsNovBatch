package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

// String Manipulation
// String s = "sd962jmjlsdjlajsd7sad23sxc9sc0saaw1scsd34";
// WAP to get all digits separated from the above string
// Character.isDigit();

//select class

public class ElementsUtility {

	private WebDriver driver;

	public ElementsUtility(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getWebElements(By locator) {
		return driver.findElements(locator);
	}

	public WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}

	public void performSendKeys(By locator, String value) {
		getWebElement(locator).sendKeys(value);
	}

	public void performClick(By locator) {
		getWebElement(locator).click();
	}

	public List<String> getRightClickMenu(By locator) {

		List<String> rightClickList = new ArrayList<String>();
		List<WebElement> menuItems = getWebElements(locator);

		System.out.println("The size of the right click menu items is : " + menuItems.size());

		for (WebElement e : menuItems) {
			String itemText = e.getText();
			rightClickList.add(itemText);
		}
		return rightClickList;
	}

	public void clickMenuItem(By locator, String value) {

		List<WebElement> menuItems = getWebElements(locator);

		System.out.println("The size of the right click menu items is : " + menuItems.size());

		for (WebElement e : menuItems) {
			String itemText = e.getText();
			if (itemText.equals(value)) {
				e.click();
				break;
			}

		}

	}
	
	//********************************Wait Utils**********************
	
	public String waitForTitle(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public String waitForTitleToBe(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 *  This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementPresenceOnDOM(By locator, int timeOut) {
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
	public WebElement waitForElementIsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));
	}
	
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForAllElementsPresenceOnDOM(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public void waitToClickWebElement (By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	public void actionsWaitToClickWebElement (By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	/**
	 * This method is used to wait with Fluent Wait Conditions and fetch a WebElement 
	 * @param locator
	 * @param timeOut
	 * @param pollingTime
	 * @return WebElement
	 */
	public WebElement waitWithFluentWait(By locator, int timeOut, int pollingTime) {
		
		Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.ignoring(ElementNotInteractableException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
public WebElement waitForVisibilityWithFluentWait(WebElement webElement, int timeOut, int pollingTime) {
		
		Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.ignoring(ElementNotInteractableException.class);

		return wait.until(ExpectedConditions.visibilityOf(webElement));
	}

	
	
	
}
