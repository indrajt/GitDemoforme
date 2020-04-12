package SmokeTest;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class PageTitleJunit {
	
	WebDriver driver;
	
	@Test
	public void PageTitleTest() {
		
		
		driver.get("https://www.google.com/");
		String actTitle = driver.getTitle();
		String expTitle = "Google";
		Assert.assertEquals(actTitle,expTitle);
		System.out.println("result: "+ actTitle);
		
	}
	@Before
	public void setup() {
		
		System.out.println("Setting up Test");
		 driver = utilities.DriverFactory.open("chrome");
		
	}
	@After
	public void complete() {
		
		System.out.println("Test completed");
		driver.close();
	}
	
	
	
}
