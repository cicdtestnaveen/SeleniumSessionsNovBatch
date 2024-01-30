package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBasicMethods {

	public static WebDriver driver;

	/**
	 * actions.click(); Clicks in the middle of the given element. Equivalent to:
	 * Actions.moveToElement(onElement).click()
	 * 
	 * actions.sendKeys();
	 *  Equivalent to calling:
	 * Actions.click(element).sendKeys(keysToSend).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		By username = By.id("Form_getForm_subdomain");
		By freeTrialBtn = By.id("Form_getForm_action_submitForm");

		WebElement un = driver.findElement(username);
		WebElement submitBtn = driver.findElement(freeTrialBtn);

		Actions actions = new Actions(driver);

		actions.sendKeys(un, "Naveen").perform();
		actions.click(submitBtn).perform();

	}

}
