package interviewPart2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteExamples {
	WebDriver driver;
	long startTime;
	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		
		driver.get("https://www.google.com/");
		
		
	}
	@Test
	public void openYahoo() {
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
			}
	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
		
	}
	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken: "+totalTime);

	}
	
}
