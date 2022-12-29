package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLogin {
	
	WebDriver driver;
	
	@FindBy(xpath = "// input[@name=\'email\']")
	private WebElement userName;

	@FindBy(xpath = "// input[@name=\'pass\']")
	private WebElement password;

	@FindBy(xpath = "// button[@name=\'login\']")
	private WebElement loginButton;

	public FaceBookLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName() {
		userName.sendKeys("vctc.com");
	}
	
	public void enterPassword() {
		password.sendKeys("334576879");
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

}
