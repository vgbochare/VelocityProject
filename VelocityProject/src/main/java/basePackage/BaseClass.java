package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;

	public static void launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); // Browser Launch
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); // Browser Launch
		}

		driver.manage().window().maximize(); // Method Chaining to Browser maximize
		// implicit wait
		driver.get("www.google.com");
	}
}
