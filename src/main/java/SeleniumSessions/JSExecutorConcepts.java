package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorConcepts {

	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://app.hubspot.com/login");
		driver.get("https://www.facebook.com/");
//		WebElement emailAdd = driver.findElement(By.cssSelector("#username"));
//		By username = By.xpath("//input[@name='username']");
//		By password = By.xpath("//input[@name='password']");
//		By loginBtn = By.xpath("//button[@type='submit']");
		
		
		JSUtilities js = new JSUtilities(driver);
		ElementsUtility element = new ElementsUtility(driver);
		
		//HubSpot Login
		
		System.out.println("Page Title ---> "+js.getTitleByJS());
		
//		js.refreshBrowserByJS();
		
//		String pageText = js.getPageInnerText();
//		System.out.println(pageText);
		
//		js.flash(emailAdd);
//		emailAdd.sendKeys("Naveen Kumar");
		
//		driver.findElement(username).sendKeys("Admin");
//		driver.findElement(password).sendKeys("admin123");
//		WebElement loginBtnWE = driver.findElement(loginBtn);
		
//		js.clickElementByJS(loginBtnWE);
		
//		js.drawBorder(loginBtnWE);
		
		
		
//		WebElement shopDeals = driver.findElement(By.xpath("//h2[contains(text(),'Value bazaar')]"));
		
//		js.scrollPageDown();
//		
//		Thread.sleep(3000);
//		
//		js.scrollPageUp();
//		
//		Thread.sleep(3000);
//		
//		js.scrollIntoView(shopDeals);
		
//		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
//		By un = By.xpath("//input[@id='username']");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		js.sendKeysUsingJSWithId("email", "Naveen");
//		js.sendKeysUsingJSWithName("pass", "Kumar");
		
		js.jsSendKeys("Kumar", password);
		
		
		//element.waitForVisibilityWithFluentWait(username, 10, 1);
		
		
		//Thread.sleep(3000);
//		js.sendKeysUsingJSWithId("email", "Naveen");
		


		
		
		
		
		
		
		
	}
	
}
