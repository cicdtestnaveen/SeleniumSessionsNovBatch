package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementRepository {

	// Anything and everything that you see on a webPage is a WebElement
	// To identify a WebElement, the address/locator of that WenElement has to be UNIQUE 
	// 'id' locator is the most unique attribute of any WebElement
	// BUT 'id' is not always available for every WebElement, so in these cases we will use 'xPath' or 'cssSelectors' strategy
	
	// Identification of WE + Action on the WE
	// By using variables for by locators, we are making our code REUSABLE
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
/*		
		//1st Way:
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Naveen Kumar");
		
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("naveen@cicdtest.com");
		
		//2nd Way:
		WebElement firstName = driver.findElement(By.id("Form_getForm_Name"));
		firstName.sendKeys("Bhargav");
		firstName.sendKeys("Manjunath");
		firstName.clear();
		firstName.sendKeys("Barkha");
*/		
		//3rd Way:
		// By Locator Repository - Page-wise
		By firstName = By.id("Form_getForm_Name");
		By email = By.id("Form_getForm_Email");
		
//		driver.findElement(firstName).sendKeys("Naveen Kr");
//		driver.findElement(email).sendKeys("naveen@cicdtest");
		
		//WebElement Repository
		WebElement fName = driver.findElement(firstName);
		WebElement mailID = driver.findElement(email);
		
		//Actions
		fName.sendKeys("Bhargav");
		mailID.sendKeys("bhargav@cicdtest.com");
		
		
		
	}

}
