package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private WebDriver driver;
	
	
	public WebDriver initDriver (String browser) {
		
		System.out.println("Browser Name : "+ browser);
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Please pass the correct browser information. The provided BrowserName is incorrect : "+ browser);
		}
		
		return driver;
	}
	
	//To launch URL
	public void launchUrl(String url) {
		driver.get(url);
	}
	
	//To get the page title
	public String pageTitle() {
		return driver.getTitle();
	}
	
	//To get Current Page URL
	public String currentPageURL() {
		return driver.getCurrentUrl();
	}
	
	//To close browser
	public void closeBrowser() {
		driver.close();
	}
	
	//To quite browser
	public void quitBrowser() {
		driver.quit();
	}
	
}
