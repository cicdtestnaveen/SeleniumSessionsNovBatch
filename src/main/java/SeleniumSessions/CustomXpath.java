package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshersworld.com/");
		
		//xpath: Its the address of the WebElement situated on a WebPage
		//two types:
		
		/*
		 * 1st: Absolute Xpath : Risky / Not recommended / Complete Path of WebElement inside DOM / This might change with new Build Merge
		 * example: /html/body/div[2]/div/div[3]/form/div/input[1]
		 * 
		 * 2nd: Relative Xpath : This is what we create as Test Engineers
		 * custom xpath
		 * 
		 * syntax : 	//tagName[@AttributeName='AttributeValue'] - 1 of 1, 1 of n
		 * //input[@id='Form_getForm_subdomain'] -> 1 of 1
		 * //input[@id] -> 1 of 18
		 * 
		 * //input[@name='subdomain']
		 * //input[@type='text']
		 * 
		 * Multiple Attributes Strategy to identify a WebElement using 'and' operator
		 * 
		 * //input[@type='text' and @name='subdomain']
		 * //input[@type='text' and @name='subdomain' and @id='Form_getForm_subdomain']
		 * 
		 * //a[text()='Terms & Conditions'] -- Hard Validation
		 * //*[text() = 'Home' and @href='/index.html']
		 * 
		 */
		
//		By.className("form-control private-form__control login-email"); // Multiple classes cannot reside in By.className
//		By.xpath("//input[@class='form-control private-form__control login-email']");
		
		/*
		 * Indexing : getting the unique xpath from collection of webElements
		 * (//input[@class='text'])[3]
		 * (//input[@class='text'])[position()=3]
		 * 
		 * Contains:
		 * //p[contains(text(),'financial commitment')]
		 * 
		 */
		By locator = By.xpath("//div[@class='intership-btn top-btn']");
		String text = driver.findElement(locator).getText();
		System.out.println(text);
		
		// Dynamic Attribute Value
		// It is not necessary that you ID attribute will always be unique
		
		// <id = xyz_123>
		// <id = xyz_456324>
		
		//main[contains(@id,'-pageContent')]
		
		//starts-with:
		//input[starts-with(@name,'user')]
		
		
		
		
		
		
	}

}
