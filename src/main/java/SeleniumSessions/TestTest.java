package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTest {

public static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> handles =	driver.getWindowHandles();
		
		List<String> listHandles = new ArrayList<String>(handles);
		
		for(String e : listHandles) {
			driver.switchTo().window(e);
			System.out.println(driver.getTitle());
		}
		
		
		
	}

}
