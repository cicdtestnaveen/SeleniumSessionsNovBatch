package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAndCheckBoxHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		
		//RadioButtons
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='IE']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='Mozilla']"));
		WebElement radio3 = driver.findElement(By.xpath("//input[@value='Opera']"));
		
		//CheckBoxes
		WebElement chkBox1 = driver.findElement(By.xpath("//input[@value='red']"));
		WebElement chkBox2 = driver.findElement(By.xpath("//input[@value='orange']"));
		
		radio1.click();
		radio2.click();
		radio3.click();
		chkBox1.click();
		chkBox2.click();
		
		
		System.out.println("Red is selected : "+chkBox1.isSelected());
		System.out.println("Red is displayed : "+chkBox1.isDisplayed());
		System.out.println("Red is enabled : "+chkBox1.isEnabled());
		
		
		
		
	}

}
