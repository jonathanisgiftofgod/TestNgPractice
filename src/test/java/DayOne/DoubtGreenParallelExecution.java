package DayOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubtGreenParallelExecution {
//	@Test
//	public void openByChrome() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.greenstechnologys.com/");
//	}
	@Test
	public void openByFireFox() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
	}
//	@Test
//	public void internetExplorer() {
//		WebDriverManager.iedriver().setup();
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("http://www.greenstechnologys.com/");
//	}
}
