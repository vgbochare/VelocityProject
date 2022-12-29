package FlipcartSite;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Method Chaining to Browser maximize

		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("patilkiran.1112@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kiran123");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kiran123");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		
		WebElement search = driver.findElement(By.xpath("//input[@title=\'Search for products, brands and more\']"));
		search.sendKeys("HP Laptop");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\'L0Z3Pu\']")).click();

		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"
		 * )).click(); ArrayList<String> ar = new
		 * ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(ar.get(1)); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@class=\'_36yFo0\']")).sendKeys("421301"
		 * ); driver.findElement(By.xpath("//span[@class=\'_2P_LDn\']")).click();
		 * Thread.sleep(2000); driver.findElement(By.
		 * xpath("//button[@class=\'_2KpZ6l _2U9uOA ihZ75k _3AWRsL\']")).click();
		 */
	}

}
