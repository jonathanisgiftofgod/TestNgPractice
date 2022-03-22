package interviewPart2;

import org.testng.annotations.Test;

public class DependsOnFails {
	@Test(timeOut=2000)
	public void parentPermission() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Permission Given");
	}
	@Test(dependsOnMethods="parentPermission", alwaysRun=true)
	public void loveMarriage() {
		System.out.println("Married");
	}
}
