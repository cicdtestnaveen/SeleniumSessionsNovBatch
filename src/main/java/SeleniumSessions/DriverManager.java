package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	public static void main(String[] args) {

//		String browser = "opera"; NullPointerException
		String browser = "safari";
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please give the correct browser info...");
		}
		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.6.2");
		
		System.out.println(driver.getTitle());
		
	}

}
