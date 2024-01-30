package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibiboDatePicker {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=Cj0KCQiAtaOtBhCwARIsAN_x-3L3m8kbtMBQTeRgqBpY1MyMfkZ0j-6RSEVqSUfTo90jaxnIxX_PFhYaAtPREALw_wcB");

		WebElement DepartureDate = driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[3]"));
		WebElement closePopup = driver.findElement(By.cssSelector(".icClose"));
		closePopup.click();
		DepartureDate.click();

//		WebElement date = driver.findElement(By.xpath("//div[contains(@aria-label,'Jan')]//p[text()='31']"));
//		date.click();

		dateSelection("Feb", "27");

		WebElement dateSelectionDone = driver.findElement(By.cssSelector(".fswTrvl__done"));
		dateSelectionDone.click();
	}

	public static void dateSelection(String month, String date) {
		WebElement dateToBe = driver
				.findElement(By.xpath("//div[contains(@aria-label,'" + month + "')]//p[text()='" + date + "']"));
		dateToBe.click();
	}

}
