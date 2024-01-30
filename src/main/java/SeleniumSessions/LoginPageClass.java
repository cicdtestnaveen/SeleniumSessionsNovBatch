package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPageClass {

	public static void main(String[] args) throws InterruptedException {

		//Browser Info
		String browserInfo = "chrome";
		
		
		//By locators
		By username = By.name("username");
		By password = By.name("password");
		
		
		By loginBtn = By.className("orangehrm-login-button");
		
		//Driver Initialization
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver(browserInfo);
		df.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Validation at Page Level
		//Page Title Validation
		String title = df.pageTitle();
		if(title.contains("HRM")) {
			System.out.println("Validation of Page Title is PASSED...");
		}
		
		//WebElement Interactions
		ElementsUtility element = new ElementsUtility(driver);
		
		Thread.sleep(3000);
		
		element.performSendKeys(username, "Admin");
		element.performSendKeys(password, "admin123");
		element.performClick(loginBtn);
		
		
		
		
		
	}

}
