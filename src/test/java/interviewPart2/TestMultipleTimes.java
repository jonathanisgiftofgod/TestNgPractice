package interviewPart2;

import org.testng.annotations.Test;

public class TestMultipleTimes {
	@Test(invocationCount = 3)
	public void testCase() {
		System.out.println("Britto");
	}
}
