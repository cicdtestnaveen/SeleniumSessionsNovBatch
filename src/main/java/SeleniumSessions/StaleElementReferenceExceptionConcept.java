package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		WebElement element = driver.findElement(By.cssSelector("#username"));
		//ECD454B971CBD1A97310EA74432B80BB_element_2
		
		element.sendKeys("Naveen");
		
		driver.navigate().refresh();
		
		element = driver.findElement(By.cssSelector("#username"));
		
		element.sendKeys("Naveen");
		//ECD454B971CBD1A97310EA74432B80BB_element_2
	}

}
