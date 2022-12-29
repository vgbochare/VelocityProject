import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.cybertekschool.com/dropdown");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement Languages = driver.findElement(By.xpath("//select[@name=\'Languages\']"));
		Select s = new Select(Languages);
		s.selectByValue("java");
		Thread.sleep(1000);
		s.selectByValue("js");
		Thread.sleep(1000);
		s.selectByValue("c#");
		Thread.sleep(1000);

		WebElement firstSelected = s.getFirstSelectedOption();
		System.out.println(firstSelected);
		System.out.println(firstSelected.getText());
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println(s.isMultiple());
		s.getAllSelectedOptions();

		// List = s.getAllSelectedOptions();
		// List = s.getOptions();

		// System.out.println(l.size());
	}
}
