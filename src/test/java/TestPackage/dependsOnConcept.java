package TestPackage;

import org.testng.annotations.Test;

public class dependsOnConcept {

	@Test (expectedExceptions = {ArithmeticException.class, NullPointerException.class}, enabled = false) 
	public void Test_A() {
		System.out.println("Test_A");
		int i = 9/0;
	}
	
	@Test (dependsOnMethods = "Test_A", enabled = false)
	public void Test_B() {
		System.out.println("Test_B");
	}

	@Test (invocationCount = 3)
	public void Test_C() {
		System.out.println("Test_C");
	}

	@Test
	public void Test_D() {
		System.out.println("Test_D");
	}
	
	
}
