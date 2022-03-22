package interviewPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageinationDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		int sizeOfPagination = driver.findElements(By.xpath("//ul[@class=\"nav nav-pills default-pills smooth-scroll\"]//following::li")).size();
		System.out.println(sizeOfPagination);
	}
}
