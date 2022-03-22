package adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMforAdactin extends BaseClass {
	public void AdactinWebElements() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userId;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
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