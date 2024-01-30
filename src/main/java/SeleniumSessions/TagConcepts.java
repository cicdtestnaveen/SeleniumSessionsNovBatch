package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagConcepts {
	
	
	/*
	 * 1. id: will always be unique
	 * 2. name: not unique
	 * 3. className: not Unique
	 */

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
//		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
//		driver.findElement(By.name("Name")).sendKeys("Naveen");
	
//		driver.findElement(By.className("_9npi")).sendKeys("Kanishk");
//		By firstName = By.name("Name");
		
		/*
		 * ElementUtil et = new ElementUtil(driver);
		 * et.getWebElement(firstName).sendKeys("Naveen");
		 */
		
//4. xpath
		
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Bhargav");

//5. cssSelector
//		driver.findElement(By.cssSelector("#email")).clear();
//		driver.findElement(By.cssSelector("#email")).sendKeys("Rahul Negi");

//6. linkText
		
//		driver.findElement(By.linkText("About Us")).click();
		
//7. partialLink
		
//		driver.findElement(By.partialLinkText("out Us")).click();
		
//8. TagName
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
//		for(WebElement e : links) {
//			System.out.println(e.getAttribute("href"));
//		}
		
		for (int i=0; i<links.size(); i++) {
			
			String linkText = links.get(i).getText();
			
			if(!links.isEmpty()) {
				System.out.println(i + " --> " + linkText);
				String href = links.get(i).getAttribute("href");
				System.out.println(href);
				System.out.println("");
			}
		}
		
		
	}

}
