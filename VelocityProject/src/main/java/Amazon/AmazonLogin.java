package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	WebDriver Driver;

	@FindBy(xpath = "//span[text()=\'Hello, sign in\']")
	private WebElement clickOnHello;
	
	@FindBy(xpath = "//input[@type=\'email\']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id=\"continue\"]")
	private WebElement clickOnContine;

	@FindBy(xpath = "//input[@type=\'password\']")
	private WebElement password;

	@FindBy(xpath = "//input[@id=\'signInSubmit\']")
	private WebElement signInButton;
	
	@FindBy(xpath="//input[@id=\'twotabsearchtextbox\']")
	private WebElement searchBar;
	
	@FindBy(xpath="//input[@id=\'nav-search-submit-button\']")
	private WebElement searchSubmit;

	//driver.findElement(By.xpath("//input[@id=\'nav-search-submit-button\']")).click();
	//driver.findElement(By.xpath("(//span[@class=\'a-truncate-cut\'])[3]")).click();


	public AmazonLogin(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Hello() {
		clickOnHello.click();
	}
	
	public void enterUserName() {
		userName.sendKeys("patilkiran.1112@gmail.com");
	}

	public void Contine() {
		clickOnContine.click();
	}
	public void enterPassword() {
		password.sendKeys("kp8623922186");
	}

	public void clickOnLoginButton() {
		signInButton.click();
	}
	
	public void Search() {
		searchBar.sendKeys("Iphone 14");
	}

	public void SearchSubmit() {
		searchSubmit.click();
	}
}
