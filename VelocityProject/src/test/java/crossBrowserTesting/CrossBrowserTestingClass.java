package crossBrowserTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class CrossBrowserTestingClass extends BaseClass {
	
	@Parameters("browsers")
	
	@BeforeClass
	public void launchB(String browser) {
		launchBrowser(browser);
	}
	
	@Test
	public void TC01() {
		
	}

}
