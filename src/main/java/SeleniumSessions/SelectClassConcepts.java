package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassConcepts {
	// Select Class is used for dropdown handling
	// Select class methods in selenium will only work with select tag webElements 
	// Select class declaration will require WebElement as Argument/Parameter
	// Models a SELECT tag, providing helper methods to select and deselect options. 

	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		WebElement countrySelection = driver.findElement(By.id("Form_getForm_Country"));
		
		Select select = new Select(countrySelection);
		
	//1	select.selectByIndex(11);
	//2	select.selectByValue("Canada");
	select.selectByVisibleText("Argentina"); //3
		
		
	}

}
