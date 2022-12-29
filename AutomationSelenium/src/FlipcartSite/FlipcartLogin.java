package FlipcartSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Method Chaining to Browser maximize

		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bhargav@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bhargav");

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
}