import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Method Chaining to Browser maximize
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver"); // URL
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();
		// alt.getText(); //Fetch the Text on Alert PopUp

		alt.accept(); // Accept the Alert Pop-Up (OK)

		//alt.dismiss(); // Dismiss the Alert Pop-Up (Cancel)
		//alt.sendKeys("Vaibhav"); // Enter the Text into input field on ALert PopUp
	}

}
