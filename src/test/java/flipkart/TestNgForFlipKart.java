package flipkart;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgForFlipKart extends BaseClass {
	@BeforeTest
	public void browserLaunch() {
		launchUrl("https://www.flipkart.com/account/login");
	}
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println("Start Time" + d);
	}
	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println("End Time" + d);
	}

	@Test
	public void loginPage() throws IOException {
		FlipKartElementsPOM f = new FlipKartElementsPOM();
		loginPageElementFinding(f.getUserId(), excelRead("Sheet1", 0, 0));
		loginPageElementFinding(f.getPassword(), excelRead("Sheet1", 0, 0));
		btnClick(f.getLogin());
	}
	@AfterTest
	public void close() {
		System.out.println("done");
	}
}
