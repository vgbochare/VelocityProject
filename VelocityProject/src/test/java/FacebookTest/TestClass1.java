package FacebookTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;


public class TestClass1 {
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
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("@BeforeSuite");
	}  
	@BeforeTest
	public void BeforeTest() {
		System.out.println("@BeforeTest");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("@AfterSuite");
	}


}
