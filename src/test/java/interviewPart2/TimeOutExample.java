package interviewPart2;

import org.testng.annotations.Test;

public class TimeOutExample {
	@Test(timeOut=2000, expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void testCase() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Britto");
	}
}
