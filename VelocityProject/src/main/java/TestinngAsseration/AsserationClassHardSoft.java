package TestinngAsseration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserationClassHardSoft {
	String expUrl = "google.com"; 
	String actUrl1 = "google.com";
	String actUrl2 = "google.co";
	
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void TC01() {
		Assert.assertEquals(actUrl1, expUrl); //True
		System.out.println("Assertion1");

		Assert.assertNotEquals(actUrl1, expUrl); //False
		System.out.println("Assertion2");

		//Assert.assertEquals(actUrl2, expUrl); //False
		//System.out.println("Assertion3");
		
		Assert.assertFalse(false); //Pass
		System.out.println("Assertion4");
		
		Assert.assertTrue(true); //Pass
		System.out.println("Assertion5");
		
		//Assert.fail(); //Forcefully Fail
	}
	
	@Test
	public void TC02() {
		soft.assertEquals(actUrl1, expUrl);
		System.out.println("TC02 Assertion1");
		
		soft.assertNotEquals(actUrl2, expUrl);
		System.out.println("TC02 Assertion2");
		
		soft.assertFalse(false);
		System.out.println("TC02 Assertion3");
	
		soft.assertTrue(true);
		System.out.println("TC02 Assertion4");
		
		soft.assertAll();
		System.out.println("TC02 Assertion5");
		
		//soft.fail(); //Forcefully Fail
	}
}
