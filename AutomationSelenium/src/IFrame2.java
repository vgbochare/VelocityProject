import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize(); // method chaining to browser maximize
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@href=\'tryit.asp?filename=tryjs_alert\']")).click();
		Thread.sleep(1000);

		ArrayList<String> ar = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ar.get(1));

		Thread.sleep(1000);

		driver.findElement(By.xpath("a[@title='Change Theme']")).click();

		WebElement tryItIframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(tryItIframe);
		Thread.sleep(1000);
		// driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("a[@title='Change Theme']")).click();

		// driver.switchTo().frame("iframeResult");
		// Thread.sleep(2000);
		// driver.findElement("//button[text()='Try it']")).click();

	}

}
