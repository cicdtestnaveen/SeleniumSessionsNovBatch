package TestPackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class pilotTestClass {
/*
 * JUNIT/TestNG : Unit Testing Frameworks given by Java and can only run in Java
 * open source
 * 
 * Purposes of TestNG:
 * 1. executes and maintains Test Cases
 * 2. order maintenance
 * 3. parameterization - to help execute in required manner
 * 4. Assertions - Match the expected result with Actual result
 * 5. HTML Report
 * 6. Annotations - are used to declare the structure/skeleton of your complete end to end test case execution
 */
	
	
	@Test 
	public void selenium() {
		String testText = "Selenium & TestNG Practice";
		
		System.out.println(testText);
		assertEquals(testText, "Selenium & TestNG Practice");
		
	}
	
	//@SuppressWarnings("deprecation")
	@Test 
	public void additionTest() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
		assertEquals(c, 30);
	}
	
	@Test 
	public void subTest() {
		int a = 20;
		int b = 10;
		int c = a-b;
		
		System.out.println(c);
	//	Assert.assertEquals(11, c);
		assertEquals(10, c);
		
	}
	
	@Test 
	public void multiplyTest() {
		int a = 20;
		int b = 10;
		int c = a*b;
		
		System.out.println(c);
		assertEquals(c, 200);
	}
	
	
	
	
}
