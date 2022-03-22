package DayOne;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	@Test
	public void tc1() {
		System.out.println("Test1");
	}
	@Test
	public void tc2() {
		SoftAssert as = new SoftAssert();
		as.assertTrue(false);
		System.out.println("Test2");
		
	}
	@Test
	public void tc3() {
		System.out.println("Test3");
	}
}
