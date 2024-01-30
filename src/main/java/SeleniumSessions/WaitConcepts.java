package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcepts {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		

		//two type of waits are there in selenium:
		/*
		 * 1. Static Wait - Thread.sleep(ms)
		 * 2. Dynamic Wait - 
		 * 2(a). implicit wait - Implicitly Wait 
		 * 2(b). explicit wait - 
		 * 		-  Fluent Wait
		 * 		-  WebDriverWait
		 * 
		 * Static Wait is going to wait for a webElement irrespective of its visibility on the DOM
		 * Dynamic Wait only waits till the WebElement is visible on the screen
		 * When you imply your WE with implicitly wait then on findElements & findElement is going to get effected
		 * Implicitly wait is by default implied on all WE 
		 * Default value of imp wait is '0' 
		 * if the element is not visible then it is going to throw NoSuchWebElement Exception
		 * 
		 * Why not to use Implicitly Waits in RealTime Framework
		 * 1. It is only implied on WEs
		 * 2. It is considered as a Global Wait and Everytime FE/FEs is going to be executed,
				The implicitly wait will also be executed and unnecessary execution of code 
				will be applied for those WEs witch does not require wait handling 
		
		 * 3. Default polling time of Implicitly wait is 500 ms
		 * 4. Implicitly wait is not going to be applied on anything except WebElements
		 * (Alerts, Title, URL...)
		 * Thread.sleep(3000); - 1 check after 3 secs
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By username = By.xpath("//input[@name='username']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(username));
		
		driver.findElement(username).sendKeys("Admin"); // we1
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"); // we2
		driver.findElement(By.xpath("//button[@type='submit']")).click();// we3
		
		/*
		 * we4
		 * we5
		 * .
		 * .
		 * .
		 * .
		 * we100
		 */
		
		
		/*Login Page
		 * imp wait - 5 sec
		 * 
		 * Home Page - 10 sec
		 * 
		 * Add Emp Details - 0 sec
		 * 
		 * Payment - 5 sec
		 * 
		 */
		
		
	}

}
