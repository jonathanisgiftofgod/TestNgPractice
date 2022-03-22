package DayOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstExcersise {
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	@Test(invocationCount=3)
	public void tc1() {
		System.out.println("Test1");
	}
	@Test(enabled=false)
	public void tc2() {
		System.out.println("Test2");
	}
	@Test(priority=3)
	public void tc3() {
		System.out.println("Test3");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
}
