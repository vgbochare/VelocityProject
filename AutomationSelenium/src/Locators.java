import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize(); // method Chaining browser maximize window

		driver.get("https://www.facebook.com"); // URL Insert

		Thread.sleep(2000);

		driver.findElement(By.name("email")).sendKeys("VelocityClass");

		driver.findElement(By.id("pass")).sendKeys("password");

		driver.findElement(By.name("login")).click();

	}

}
