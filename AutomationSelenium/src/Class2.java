import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		//driver.get("https://www.selenium.dev/downloads"); // URL Insert
		
		driver.navigate().to("https://www.selenium.dev/downloads"); // URL Insert // Method Chaining

		String url = driver.getCurrentUrl(); // Return the URL of Browser
		System.out.println(url);
		System.out.println(driver.getTitle()); // Return the Title of Tab

		Navigation nv = driver.navigate();
		nv.back(); // Click on Backward Button // Backward

		nv.forward(); // Click on Forward Button // Forward
		Thread.sleep(2000); // wait for 2 second

		nv.refresh(); // browser refresh/reload
		Thread.sleep(2000); // Delay for 2 second
		
		
		driver.close();	//Current Tab of BROWSER close
		driver.quit();	// All Tab of BROWSER close

	}

}
