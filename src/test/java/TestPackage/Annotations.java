package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	/*
	 * Annotations:
	 * 
	 * Global Pre-Conditions
	 * Preditions
	 * Test Steps
	 * Post Steps 
	 * PASS/FAIL/SKIP
	 * Report
	 * 
	 * 
	 * @Before Suite -- Connect with DB
	 * @Before Class -- Initiate a user in DB
	 * @Before Test -- Launch Browser
	 * @Before Method --  User Login - app
	 * @Test -- Test 1
	 * @Test -- Test 2
	 * @After Method -- User Logout - app
	 * @After Test -- Close Browser
	 * @After Class -- Delete the user from DB
	 * @After Suite -- disconnect DB
	 * 
	 */
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@Before Suite -- Connect with DB");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@Before Class -- Initiate a user in DB");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@Before Test -- Launch Browser");
	}
	
	@BeforeMethod 
	public void beforeMethod() {
		System.out.println("@Before Method --  User Login - app");
	}
	
	@Test
	public void Test_1() {
		System.out.println("@Test --> Test 1");
	}
	
	@Test
	public void Test_2() {
		System.out.println("@Test --> Test 2");
	}
	
	@Test
	public void Test_3() {
		System.out.println("@Test --> Test 3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@After Method -- User Logout - app");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@After Test -- Close Browser");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@After Class -- Delete the user from DB");
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		System.out.println("@After Suite -- disconnect DB");
	}
	
	/*Console Result:
	 * 
@Before Suite -- Connect with DB
@Before Test -- Launch Browser
@Before Class -- Initiate a user in DB

	@Before Method --  User Login - app
		@Test --> Test 1
	@After Method -- User Logout - app

	@Before Method --  User Login - app
		@Test --> Test 2
	@After Method -- User Logout - app

	@Before Method --  User Login - app
		@Test --> Test 3
	@After Method -- User Logout - app

@After Class -- Delete the user from DB
@After Test -- Close Browser
	 * 
	 */
	
	
}
