package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=Cj0KCQiAtaOtBhCwARIsAN_x-3L3KG6NkllP1Vd6QogbxzWBkgh_3AlGPqw4CJbjOAvFunnEqFMt4egaAuusEALw_wcB");

		driver.findElement(By.cssSelector(".icClose")).click();
		//div[contains(@aria-label,'Jan')]/p[text()='27']		
	
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[3]")).click();
		
//		driver.findElement(By.xpath("//div[contains(@aria-label,'Jan')]/p[text()='27']")).click();
		goIbiboDepartureDatePicker("Feb","22");
		
		
		//Click on Done
		driver.findElement(By.cssSelector(".fswTrvl__done")).click();
		
	}
	
	public static void goIbiboDepartureDatePicker(String month, String date) {
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"')]/p[text()='"+date+"']")).click();
	}

}
