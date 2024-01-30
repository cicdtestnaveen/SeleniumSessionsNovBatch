package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		By locator = By.id("justAnInputBox");
		
		
		driver.findElement(locator).click();
		
		By ddlist = By.xpath("//span[@class='comboTreeItemTitle']");
		
		forLoop(ddlist);
	}
	
	public static void forLoop(By locator) {
		List<WebElement> list = driver.findElements(locator);
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			}
	}

}
