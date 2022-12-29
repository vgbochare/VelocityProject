package AmazonSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Method Chaining to Browser maximize
		driver.get("https://www.amazon.in/"); // URL
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()=\'Hello, sign in\']")).click();
		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("patilkiran.1112@gmail.com");
		driver.findElement(By.xpath("//input[@id=\'continue\']")).click();
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("kp8623922186");
		driver.findElement(By.xpath("//input[@id=\'signInSubmit\']")).click();
		
		/*
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//span[@class=\'hm-icon-label\']")).click();
		 * driver.findElement(By.xpath("//div[text()=\'Mobiles, Computers\']")).click();
		 * driver.findElement(By.xpath("//a[text()=\'All Mobile Phones\']")).click();
		 * Thread.sleep(1000); WebElement click =
		 * driver.findElement(By.xpath("//span[text()=\'Smartphones & Basic Mobiles\']")
		 * ); click.click(); //Actions abc = new Actions(driver);
		 * //abc.moveToElement(click).perform(); //abc.click().perform();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//span[text()=\'Smartphones\']")).click();
		 */
		driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']")).sendKeys("Iphone 14");
		driver.findElement(By.xpath("//input[@id=\'nav-search-submit-button\']")).click();
		driver.findElement(By.xpath("(//span[@class=\'a-truncate-cut\'])[3]")).click();

		WebElement buy = driver.findElement(By.xpath("//input[@id=\'buy-now-button\']"));
		buy.click();
		/*
		 * driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("412207");
		 * driver.findElement(By.xpath("(//input[@type=\'submit\'])[2]")).click();
		 * Thread.sleep(2000);
		 */
		WebElement click1 = driver.findElement(By.xpath("(//input[@type=\'radio\'])[2]"));
		click1.click();
		driver.findElement(By.xpath("//span[@class=\'a-dropdown-prompt\']")).click();
		WebElement bank = driver.findElement(By.xpath("//a[text()=\'Axis Bank\']"));
		bank.click();
		driver.findElement(By.xpath("( //input[@type=\'submit\'])[4]")).click();
	}
}
