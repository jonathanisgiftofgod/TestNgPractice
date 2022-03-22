package interviewPart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckAllCheckBoxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		List<WebElement> allBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement x : allBoxes) {
			if(x.isSelected()) {
				x.click();
				x.click();
			}
			else {
				x.click();
			}
		}
	}
}
