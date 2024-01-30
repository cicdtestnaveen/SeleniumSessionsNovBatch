package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class pilotClass {
	
	// When you close the browser only your current browser window will be closed
	// When you quit the browser, all your browser windows that are open, will be closed together
	// When you quit your browser, Session ID goes null
	// When you close your browser, Session ID is retained but, the session gets invalid

	public static void main(String[] args) {

		// Top Casting
		WebDriver driver = new EdgeDriver();
		//ChromeDriver: chrome on windows (309991ac11e77be66264c1083d26a41c)
		
		// driver.get("https://www.google.com/");
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.6.2");
		//EdgeDriver: MicrosoftEdge on windows (1af071a098c0a9d97e8a3dffc27d20e6)
		
		
		System.out.println(driver.getCurrentUrl());
		//1. EdgeDriver: MicrosoftEdge on windows (1af071a098c0a9d97e8a3dffc27d20e6) - Close
		//2. EdgeDriver: MicrosoftEdge on windows (41f1b64fb5ae9069f15ab303c3fc2a3a) - Quit
		
//		System.out.println(driver.getPageSource());

//		String pageTitle = driver.getTitle();

		System.out.println(driver.getTitle());
		//1. EdgeDriver: MicrosoftEdge on windows (1af071a098c0a9d97e8a3dffc27d20e6) - Close
		//2. EdgeDriver: MicrosoftEdge on windows (41f1b64fb5ae9069f15ab303c3fc2a3a) - Quit
//	    driver.close(); //NoSuchSessionException: invalid session id
	    //Session ID is secured, but just because the current browser is not open now, so it will throw, InvalidIDException
	    
		driver.quit(); //NoSuchSessionException: Session ID is null
		//EdgeDriver: MicrosoftEdge on windows (41f1b64fb5ae9069f15ab303c3fc2a3a)
		
	driver.getTitle(); 
	//EdgeDriver: MicrosoftEdge on windows (1af071a098c0a9d97e8a3dffc27d20e6)	
	// EdgeDriver: MicrosoftEdge on windows (null)	

	}

}
