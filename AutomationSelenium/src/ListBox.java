import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[text()=\'Create New Account\']")).click();
		driver.findElement(By.xpath("(//a)[3]")).click();
		//driver.findElement(By.id("firstname_input")).sendKeys("patil");
		//driver.findElement(By.name("lastname")).sendKeys("kp");
	   WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	    Thread.sleep(2000);
	    
	    Select s = new Select(month);
	    Thread.sleep(3000);
	    
	    s.selectByIndex(3);
	    Thread.sleep(2000);
	    s.selectByValue("8");
	    Thread.sleep(2000);
	    s.selectByVisibleText("jan");
	}
}
