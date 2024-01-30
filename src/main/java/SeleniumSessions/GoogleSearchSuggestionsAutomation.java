package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestionsAutomation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		By searchBox = By.id("APjFqb");
		By suggestionsList = By.xpath("//ul[@class='G43f7e']//li//div[@class='wM6W7d']/span");

		driver.findElement(searchBox).sendKeys("Selenium");

		Thread.sleep(3000);

		List<WebElement> suggestionList = driver.findElements(suggestionsList);

		System.out.println("The size of all suggestions appeared on screen is : " + suggestionList.size());

		for (WebElement e : suggestionList) {
			String textOfSuggestion = e.getText();
			System.out.println(textOfSuggestion);
			if (textOfSuggestion.equalsIgnoreCase("selenium download")) {
				e.click();
				break;
			}

		}

	}

}
