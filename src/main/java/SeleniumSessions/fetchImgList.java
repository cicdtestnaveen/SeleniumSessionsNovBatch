package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchImgList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
//		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		List <WebElement> imgList = driver.findElements(By.tagName("img"));
		
		System.out.println("Total Images : "+ imgList.size());
		
		for(int i = 0; i<imgList.size(); i++) {
			String src = imgList.get(i).getAttribute("src");
			String altText = imgList.get(i).getAttribute("alt");
			
			System.out.println(src);
			System.out.println(altText);
			System.out.println("");
		}
		
		
	}

}
