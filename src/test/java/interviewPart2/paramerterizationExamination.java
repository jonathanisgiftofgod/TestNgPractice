package interviewPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paramerterizationExamination {
	String [][] data = {{"britto", "joseph"},
			{"venki","waran"},
			{"jona","poppu"}};
	
	@DataProvider(name = "testData")
	public String [][] dataDetails() {
		return data;
	}
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	private void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}
	@BeforeMethod
	@Parameters("URL")
	public void openUrl(String url) {
		driver.get(url);
	}
	@Test(dataProvider="testData")
	public void userDetails01(String username, String userPass) throws InterruptedException {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(userPass);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	@Test(dataProvider="testData")
	public void userDetails02(String username, String userPass) throws InterruptedException {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(userPass);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void valid() {
		System.out.println("All the best");
	}
	@AfterClass
	public void close() {
		driver.close();
	}
}
