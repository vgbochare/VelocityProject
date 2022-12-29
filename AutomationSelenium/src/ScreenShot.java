import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Method Chaining to Browser Maximize
		driver.navigate().to("https://www.linkedin.com");
		Thread.sleep(1000);

		Date date = new Date(); // get current date time with Date()
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddmmyyyy-HHmmss"); // Create object of SimpleDateFormat class
		// and decide the format
		String date1 = dateFormat.format(date); // Now format the date
		// System.out.println(date1);

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("D:\\Vaibhav\\Software Testing\\Vaibhav.WorkSpace\\AutomationSelenium\\Screenshot Folder\\"+ date1 + ".jpg");
		FileHandler.copy(source, Dest);

	}

}
