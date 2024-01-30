package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.out.println("@beforeTest --> setup");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("@AfterTest --> tearDown");
		driver.quit();
	}
}
