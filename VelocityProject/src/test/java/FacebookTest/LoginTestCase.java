package FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebook.FaceBookLogin;

public class LoginTestCase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Method Chaining to Browser maximize
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		FaceBookLogin login = new FaceBookLogin(driver);
		login.enterUserName();
		login.enterPassword();
		Thread.sleep(1000);
		login.clickOnLoginButton();
	}

}
