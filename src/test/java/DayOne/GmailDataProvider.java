package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailDataProvider {
	String[][] data = {
			{"britto","joseph"},
			{"jonathan", "britto"},
			{"nancy","currie"},
	};
	@DataProvider(name= "login")
	public String[][] loginDataProvider() {
		return data;	
	}
	@Test(dataProvider="login")
	public void login(String userId, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userId);
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[1]")).click();

	}
}
