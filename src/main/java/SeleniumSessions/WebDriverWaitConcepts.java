package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcepts {

	public static WebDriver driver;
	
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		System.out.println(waitForTitle("Login", 10));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		
//		wait.until(ExpectedConditions.titleContains("HRM")); // org.openqa.selenium.TimeoutException
		
//		System.out.println(driver.getTitle());
//		By un = By.xpath("//input[@name='username']");
//		
////		wait.until(ExpectedConditions.presenceOfElementLocated(un));
//		
//		driver.findElement(un).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	public static String waitForTitle(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public static String waitForTitleWithPollinTime(String title, int timeout, int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	

}
