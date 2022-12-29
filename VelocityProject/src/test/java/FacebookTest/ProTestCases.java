package FacebookTest;

import org.testng.annotations.Test;

public class ProTestCases {

	@Test(priority = 1)
	public void TC03() {
		System.out.println("TC03");
	}

	@Test(priority = 2)
	public void TC01() {
		System.out.println("TC01");
	}

	@Test
	public void TC02() {
		System.out.println("TC02");
	}

	@Test(enabled = false)
	public void TC04() {
		System.out.println("TC04");
	}

	@Test(invocationCount = 3)
	public void TC05() {
		System.out.println("TC05");
	}

	@Test(dependsOnMethods = "TC07")
	public void TC06() {
		System.out.println("TC06");
	}

	@Test(timeOut = 2000)
	public void TC07() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("TC07");
	}
	@Test
	public void TC08() {
		System.out.println("TC08");
	}
}
