package interviewPart2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoToUrlWithoutGetAndNaviagate {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String url = "http://www.google.com";
		js.executeScript("window.location=\'"+url+"\'");
	}
}
