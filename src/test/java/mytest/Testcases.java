package mytest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// hard assertion: hard validation: if hard assertion is getting failed -->immediately test case will be marked as failed and test case will be terminated
// soft assertion: soft validation: if soft assertion is getting failed--> immediately test case will -- 
//execute below line of code and test case will be passed until we use softassert.assertAll() at the end of the test case

public class Testcases {

	SoftAssert softassert = new SoftAssert();

	@Test
	public void test1() {

		System.out.println("Open browser");
		Assert.assertEquals(true, true);
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("click on sign in button");

		Assert.assertEquals(true, true);
		System.out.println("validate Home page");

		softassert.assertEquals(false, true);// soft assertion

		System.out.println("go to deals page");
		System.out.println("create deals page");

		System.out.println("go to contact page");
		System.out.println("create contact ");

		softassert.assertAll();

	}

	@Test
	public void test2() {
		
		
		softassert.assertEquals(false, true);
		System.out.println("logout");
		softassert.assertAll();
	}
	
	@AfterClass
	public void tearDown() {
		softassert.assertAll();
		
	}
	
}
