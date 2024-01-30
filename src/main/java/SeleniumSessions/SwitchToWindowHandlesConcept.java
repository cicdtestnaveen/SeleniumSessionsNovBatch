package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowHandlesConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newTabsBtn")).click();

//		String currentWindow = driver.getWindowHandle();
//		
//		for(String e : driver.getWindowHandles()) {
//			if(e!=currentWindow)
//			{
//				driver.switchTo().window(e);
//				
//			}
//		}

//		switchToWindows("XPath");

//		System.out.println(driver.getTitle());

//		WebElement eleWindow2 = driver.findElement(By.cssSelector(".post-title.entry-title"));
//		
//		WebElement eleWindow1 = driver.findElement(By.id("newWindowBtn"));
		
		String currentWindowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listHandles = new ArrayList<String> (windowHandles);
		
		for(String e : listHandles) {
			driver.switchTo().window(e);
			System.out.println(driver.getTitle());
		}
		
//		String targetWindow = listHandles.get(1);
//		driver.switchTo().window(targetWindow);
//		
//		System.out.println(driver.getTitle());
//		

	}

	public static void switchToWindows(String pageTitleSwitchWindow) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String e : windowHandles) {
			String pageTitle = driver.switchTo().window(e).getTitle();
			if (pageTitle.contains(pageTitleSwitchWindow)) {
				break;
			}
		}
	}

}
