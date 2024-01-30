package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTest1 {
public static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Naveen");
		
		List<WebElement> suggestionsList = driver.findElements(By.cssSelector(".wM6W7d"));
		
		for(WebElement e : suggestionsList) {
			System.out.println(e.getText());
		}
		
		
		
	}

}
