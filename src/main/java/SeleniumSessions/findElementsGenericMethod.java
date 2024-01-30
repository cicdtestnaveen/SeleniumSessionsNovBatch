package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsGenericMethod {
	


	public static void main(String[] args) {

		
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver("chrome");
		df.launchUrl("https://www.amazon.in/");
		System.out.println(df.currentPageURL());
		String title = df.pageTitle();
		System.out.println(title);
		
//		driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
		
		By links = By.tagName("a"); // Junior SDET 
		
		ElementsUtility et = new ElementsUtility(driver); 
		
//		int totalLinksCount = getWebElements(links).size();
		int totalLinksCount = et.getWebElements(links).size();
		
		System.out.println(totalLinksCount);
		
	}
	
	// Senior QA Analyst - SDET
//	public static List<WebElement> getWebElements(By locator){
//		return driver.findElements(locator);
//	}
//	
//	public static WebElement getWebElement(By locator) {
//		return driver.findElement(locator);
//	}
//
//	public static void performSendKeys (By locator, String value) {
//		getWebElement(locator).sendKeys(value);
//	}
//	
//	public static void performClick(By locator) {
//		getWebElement(locator).click();
//	}
}
