package Zerodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Method Chaining to Browser maximize
		driver.get("https://kite.zerodha.com/"); // URL
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\'userid\']")).sendKeys("HS5866");
		driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys("vaibhav@10");
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@type=\'submit\']"));
		driver.findElement(By.xpath("//button[text()=\'Start investing \']"));
	}
}
