package TestPackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonTestClass extends BaseTest {


	@Test (priority = 1)
	public void amazonTitleValidation() {
		
		System.out.println("@Test --> amazonTitleValidation");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test (priority = 2)
	public void amazonLogo() {
		System.out.println("@Test --> amazonLogo");
		assertTrue(!driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	
	@Test (priority = 3)
	public void footerCountValidation() {
		System.out.println("@Test --> footerCountValidation");
		int count = driver.findElements(By.cssSelector(".navFooterLinkCol.navAccessibility ul li")).size();
		assertEquals(count, 21);
	}
	
	
	
}
