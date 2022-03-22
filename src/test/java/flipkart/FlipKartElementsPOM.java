package flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartElementsPOM extends BaseClass {
	public FlipKartElementsPOM() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement userId;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="(//span[contains(text(),'Login')])[2]")
	private WebElement login;
	public WebElement getUserId() {
		return userId;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
}
