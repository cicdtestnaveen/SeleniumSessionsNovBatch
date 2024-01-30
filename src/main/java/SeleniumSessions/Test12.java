package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//		WebElement ele = driver.findElement(By.cssSelector("#username"));
		WebElement ele = driver.findElement(By.id("newWindowBtn"));

		ele.click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String e : windowHandles) {
			String pageTitle = driver.switchTo().window(e).getTitle();
			if (pageTitle.contains("H Y R Tutorials - Atom")) {
				break;
			}
		}

		WebElement basicControls = driver.findElement(By.cssSelector(".post-title.entry-title"));
		ele = driver.findElement(By.id("newWindowBtn"));

//		System.out.println(driver.getWindowHandles());
//		
//		String currentWindow = driver.getWindowHandle();
//		
//		for (String e : driver.getWindowHandles()) {
//			if (e!=currentWindow) {
//				driver.switchTo().window(e);
//			}
//		}

		// driver.navigate().refresh();

//		ele.sendKeys("Kumar");

//		JSUtilities js = new JSUtilities(driver);
//		
//		js.flash(driver.findElement(By.cssSelector("#username")));
		// E444AAAE59E246DC782A973077C825EC_element_2
	}

}
