package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSelectionGenericApproach {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		By ddOptionsWE = By.xpath("//span[@class='comboTreeItemTitle']");

		// Single Selection
		 //selectOptionFromDD (ddOptionsWE, "choice 6 2");

		// Multiple Selection
		// selectOptionFromDD(ddOptionsWE, "choice 6 2", "choice 3", "choice 6 2 1", "choice 5");

		// Select "ALL"
		selectOptionFromDD(ddOptionsWE, "ALL");

	}

	public static void selectOptionFromDD(By ddOptionsWE, String... value) {
		List<WebElement> ddOptionsList = driver.findElements(ddOptionsWE);
		if (!value[0].equalsIgnoreCase("All")) {
			System.out.println(ddOptionsList.size());
			for (int i = 0; i < ddOptionsList.size(); i++) {
				String text = ddOptionsList.get(i).getText();
				 System.out.println(text);
				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						ddOptionsList.get(i).click();
						break;
					}
				}
			}
		}else {
			try {
				for (WebElement e : ddOptionsList) {
					System.out.println( e.getText());
					e.click();
				}
			} catch (Exception e) {

			}
		}

	}
}
