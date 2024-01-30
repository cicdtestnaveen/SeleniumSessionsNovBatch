package TestPackage;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	/*
	 * a) Priority Selection
	 * preferenceList:
	 * 1 --> priority = '-n'
	 * 2 --> No Priority Test Cases --> Alpha Order
	 * 3 --> priority = '0'
	 * 4 --> priority = 'n'
	 * 
	 * b) To not run a particular test case in test class --> (enabled = false) beside @Test (any) annotation
	 * 
	 * c) To always run a test case --> (alwaysRun=true) beside @Test (any) annotation
	 * 
	 * d) For Handling Exceptions --> (expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	 * 
	 * e) Depends On some Other Method's Pass Execution --> (dependsOnMethods = "Test_A")
	 * 
	 * f) To run one test case multiple times --> (invocationCount = 3)
	 */

	@Test (enabled = true)
	public void Test_B() {
		System.out.println("Test_B");
	}

	@Test (alwaysRun=true)
	public void Test_A() {
		System.out.println("Test_A");
	}

	@Test(priority = -1)
	public void Test_C() {
		System.out.println("Test_C");
	}

	@Test(priority = 0)
	public void Test_D() {
		System.out.println("Test_D");
	}

	@Test(priority = 5)
	public void Test_E() {
		System.out.println("Test_E");
	}

	@Test(priority = 6)
	public void Test_F() {
		System.out.println("Test_F");
	}

}
