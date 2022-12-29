import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.selenium.dev/downloads"); // URL Insert
	}

}
