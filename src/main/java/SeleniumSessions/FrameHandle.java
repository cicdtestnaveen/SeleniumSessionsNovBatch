package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		
		
		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		
	}

}
