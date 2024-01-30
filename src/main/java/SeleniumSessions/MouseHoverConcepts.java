package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement target = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		WebElement clickAction = driver.findElement(By.xpath("//*[text()='Explore Showroom']"));
		
		mouseHoverAction(target, clickAction);
	}
	
	public static void mouseHoverAction(WebElement target, WebElement clickAction) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).click(clickAction).build().perform();
	}

}
