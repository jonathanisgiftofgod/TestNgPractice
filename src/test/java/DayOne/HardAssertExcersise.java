package DayOne;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExcersise {
	@Test
	public void tc1() {
		System.out.println("Test1");
	}
	@Test
	public void tc2() {
		Assert.assertTrue(false);
		System.out.println("Test2");
	}
	@Test
	public void tc3() {
		System.out.println("Test3");
	}
}
