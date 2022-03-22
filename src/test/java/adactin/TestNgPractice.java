package adactin;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice extends BaseClass{
	@BeforeTest
	public void browserLaunch() {
		System.out.println("Hello");
	}
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println("Start Time" +d);
	}
	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println("End Time" +d);
	}
	@Test
	public void LoginPage() throws IOException {
		POMforAdactin p = new POMforAdactin();
		launchUrl("http://adactinhotelapp.com/");
		enterText(p.getUserId(), readExcel("C:\\Users\\Britto\\eclipse-workspace\\TestNgPractice\\Driver\\Adactin.xlsx", "Sheet1", 0, 0));
		btnClick(p.getLogin());
	}
}
