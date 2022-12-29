package AmazonTest;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon.AmazonLogin;

public class AmazonTestCase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Method Chaining to Browser maximize
		driver.get("https://www.amazon.in/"); // URL
		Thread.sleep(1000);
		
		AmazonLogin login = new AmazonLogin(driver);
		login.Hello();
		login.enterUserName();
		login.Contine();
		login.enterPassword();
		login.clickOnLoginButton();
		login.Search();
		login.SearchSubmit();
	}
}
