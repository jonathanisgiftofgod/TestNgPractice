package DayOne;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookPractice {
	
	@Test
	@Parameters({"user","password"})
	public void LoginID(String userId, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(userId);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String expected = driver.getCurrentUrl();
		String actual = "https://m.facebook.com/?_rdr";
		assertEquals(expected, actual);
	}
}
