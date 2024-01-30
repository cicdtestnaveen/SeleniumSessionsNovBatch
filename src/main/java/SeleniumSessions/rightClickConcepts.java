package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickConcepts {

	public static WebDriver driver;
	
	
	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClick  = driver.findElement(By.xpath("(//*[text()='right click me'])[1]"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(rightClick).perform();
		
		List<WebElement> listItems = driver.findElements(By.xpath("//ul//li[contains(@class, 'context-menu-icon')]"));
		By rightClickListItems = By.xpath("//ul//li[contains(@class, 'context-menu-icon')]");
//		for (WebElement e : listItems) {
//			String itemText = e.getText();
//			System.out.println(itemText);
//			
//			if(itemText.equals("Paste")) {
//				e.click();
//				break;
//			}
//		}
		
	List <String> menuOptions = getRightClickMenu(rightClickListItems);
//		System.out.println(menuOptions);
		
		clickMenuItem(rightClickListItems, "Quit");
	}
	
	/**
	 * This method is to get the list of menu items after performing right click
	 * @param locator
	 * @return : rightClickList
	 */
	public static List<String> getRightClickMenu (By locator) {
		
		List <String> rightClickList = new ArrayList<String>();
		List<WebElement> menuItems = driver.findElements(locator);
		
		System.out.println("The size of the right click menu items is : "+menuItems.size());
		
		for (WebElement e : menuItems) {
			String itemText = e.getText();
			rightClickList.add(itemText);
		}
		return rightClickList;
	}
	
	public static void clickMenuItem (By locator, String value) {
		
		List<WebElement> menuItems = driver.findElements(locator);
		
		System.out.println("The size of the right click menu items is : "+menuItems.size());
		
		for (WebElement e : menuItems) {
			String itemText = e.getText();
			if(itemText.equals(value)) {
				e.click();
				break;
			}
			
		}
	}
	
	

}
