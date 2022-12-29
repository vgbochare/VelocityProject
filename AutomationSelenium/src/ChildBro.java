import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBro {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		Thread.sleep(4000);
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()=\'Try it Yourself »\'])[1]")).click();
		Thread.sleep(2000);
		
		String mainWindowId = driver.getWindowHandle(); // return ID of main window
		String expUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		String expID = "";
		
		Set<String> allAdd = driver.getWindowHandles(); // main + ID of child Windows
		for (String s : allAdd) {
			System.out.println(s); // Fetching one by one from set
			driver.switchTo().window(s); // switch to new window by using ID
			String actURL = driver.getCurrentUrl(); // fetching the URL of New Window after switch
			if (expUrl.equals(actURL)) {
				System.out.println("Correct Window");
				expID = s; // Stored ID after switch in correct window
				break;
			} else {
				System.out.println("Wrong Window");
			}
		}
		driver.switchTo().window(expID); // Switch to expected window by ID

	}

}
