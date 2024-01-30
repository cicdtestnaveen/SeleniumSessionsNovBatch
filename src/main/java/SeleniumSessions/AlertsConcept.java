package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcept {

public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By signInBtn = By.xpath("//input[@type='submit']");
		
		driver.findElement(signInBtn).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		alert.dismiss();
		
		
//		By signInBtn1 = By.xpath("//input[@type='submit']");
	
		driver.switchTo().defaultContent();
		
		By signInBtn2 = By.xpath("//input[@type='submit']");
		String text = driver.findElement(signInBtn2).getText(); 
		System.out.println(text);
		
		
//		String text = driver.findElement(signInBtn2).getText(); 
		
	}

	
	
	
}
