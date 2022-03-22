package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookGroups {
	WebDriver driver;
	@BeforeTest
	public void launchUrl() {
		System.out.println("Hello");
	}
	
	@Test(groups= {"okgroup"})
	
	public void loginCorrectDetails() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jonathan");
		driver.findElement(By.id("pass")).sendKeys("britto");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.quit();
	}
	@Test(groups= {"okgroup"})
	
	public void loginInCorrectDetails() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("nancy");
		driver.findElement(By.id("pass")).sendKeys("currie");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.quit();
	}
	@Test
	
	public void loginInCorrectAndCorrectDetails() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("britto");
		driver.findElement(By.id("pass")).sendKeys("jonathan");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.quit();
	}
}
