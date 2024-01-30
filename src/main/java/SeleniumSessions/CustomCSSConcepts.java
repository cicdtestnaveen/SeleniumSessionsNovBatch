package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSConcepts {

	public static void main(String[] args) {

		// We use CSS selectors to identify the WE on dom
		// id -> #id, tag#id
		// class -> .className, tag.class
		// //tag[@class='Value'] --> Xpath
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By locator = By.cssSelector("#username");
		
		By loginWebElements = By.cssSelector("input[id$='me'], #password, button[data-test-id='sso-login-button']");
		
		List<WebElement> elementList = driver.findElements(loginWebElements);
		
		if(elementList.size() == 3) {
			System.out.println("Login screen is displayed with all necessary WebElements...");
		}
		
		/* Valid CSS Selectors
		 * 
		 * .form-control.private-form__control.login-email
		 * input#username
		 * input.form-control.private-form__control.login-email
		 * input#username.form-control.private-form__control.login-email
		 * input.form-control.private-form__control.login-email#username
		 * .form-control.private-form__control.login-email#username
		 * 
		 * input[type='submit'] --> CSS Selector
		 * //input[@type='submit'] --> Xpath
		 * 
		 * //input[@type='submit' and @value='Login'] --> Xpath
		 * input[type='submit'][value='Login'] --> CSS Selector
		 * 
		 * Traversing on DOM:
		 * 
		 * Parent to Child:
		 * 
		 * //div[@class='input-group']/input --> Xpath
		 * .input-group input --> CSS Selector
		 * .input-group input[type='text'] --> CSS Selector
		 * .input-group > input[type='text'] --> CSS Selector
		 * 
		 * Child to Parent: Not possible with CSS Selectors
		 * 
		 * Contains:
		 * //input[contains(@id,'user')] --> xPath
		 * input[id*='user'] --> CSS Selector
		 * input[type*='em'] --> CSS Selector
		 * 
		 * Starts-With:
		 * //input[starts-with(@id,'user')] --> xPath
		 * input[id^='u'] --> CSS Selector
		 * 
		 * Ends-With:
		 * input[id$='me'] --> CSS Selector
		 * 
		 * comma operator only in CSS Selector and not in case of Xpath --> To get multiple WebElements that have no relation with each other
		 * input[id$='me'], #password, button[data-test-id='sso-login-button']
		 * 
		 * Sibling-Movement in CSS Selectors via " + " Operator
		 * div.input-group input + input
		 * There can only be forward movement in the sibling hierarchy, we cannot move backwards in CSS Selector
		 * 
		 * Indexing in CSS Selectors
		 * Movement is row-wise
		 * 
		 * Syntax: ":nth-of-type(n) --> All WebElements"
		 * Syntax: ":nth-of-type(1) --> All WebElements in first row"
		 * div.navFooterLinkCol.navAccessibility ul li:nth-of-type(8)
		 * 
		 * 
		 * Interview Question:
		 * Which one among xpath and css selector should be used while creating the framework 
		 * and which one should be considered as important or primary while deciding how to fetch WebElement?
		 * 
		 *  Ideal Approach  - A mix of both.
		 */
		
		
		
		
		
		
	}

}
