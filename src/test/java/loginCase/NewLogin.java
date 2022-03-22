package loginCase;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class NewLogin {
	WebDriver driver;
	String[][] data = null;
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;
	}
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\Britto\\Desktop\\JAVA\\TestNgNew.xls");
		jxl.Workbook workbook = jxl.Workbook.getWorkbook(f);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		String testData[][]= new String[rowsCount-1][columnsCount];
		for (int i = 1; i < rowsCount; i++) {
			for (int j = 0; j < columnsCount; j++) {
				testData[i-1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}
	@BeforeTest
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test(dataProvider="loginData")
	public void userIdAndPassword(String userId, String pass) {
		driver.findElement(By.id("txtUsername")).sendKeys(userId);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
	}
	@AfterTest
	public void closeUrl() {
		driver.quit();
	}
}
