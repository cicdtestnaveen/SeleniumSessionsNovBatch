package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcepts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/pakistan-in-australia-2023-24-1375835/australia-vs-pakistan-3rd-test-1375844/full-scorecard");
		
		String playerName = "Sajid Khan";
		
		String wicketTaker = driver.findElement(By.xpath("((//span[text()='"+playerName+"'])[1]/../../../../following-sibling::td)[position()=1]")).getText();
		
		System.out.println(wicketTaker);
		//parent to child:
		
		//form[@id='hs-login']//div
		//form[@id='hs-login']/button
		
//		(//form[@id='hs-login']//button)[position()=3]
//		(//form[@id='hs-login']//button)[3]
		
//		//form[@id='hs-login']//child::div	
		
		
		//child to parent: Backward Traversing
		
// 		//div[@class='signup-link']/../../../../../..
//		//div[@class='input-group']//parent::form//parent::div
		//input[@name='username']//ancestor::form
		
// Give xpath of the checkbox corresponding Selenium (Company Name) and I should be able to identify all checkbox using the company name
		
		//td[text()='Selenium']//preceding-sibling::td//input[@type='checkbox']
		//td[text()='Ola']//following-sibling::td
		
	}

}
