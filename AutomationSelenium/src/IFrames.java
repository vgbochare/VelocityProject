import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href=\'tryit.asp?filename=tryjs_alert\']")).click();
		Thread.sleep(1000);
		
		ArrayList <String> ar =new ArrayList <String> (driver.getWindowHandles());
		driver.switchTo().window(ar.get(1));
		
		Thread.sleep(1000);
		
		WebElement frame = driver.findElement(By.xpath("iFrame[@id='iFrameResult']"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
	}

}
