package FacebookTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anootations {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("@Before Class");
	}

	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void TC01() {
		System.out.println("TC01");
		
	}
	
	@Test
	public void TC02() {
		System.out.println("TC02");
	}
	
	@Test
	public void TC03() {
		System.out.println("TC03");
	}
	
	@Test
	public void TC04() {
		System.out.println("TC04");
	}
	@Test
	public void TC05() {
		System.out.println("TC05");
	}
	@Test
	public void TC06() {
		System.out.println("TC06");
	}
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void closeBrowser() {
		System .out.println("@AfterClass");
	}
}
