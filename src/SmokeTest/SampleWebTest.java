package SmokeTest;

//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleWebTest {
	WebDriver driver;
	
	@Test
		public void sampleTest1() {
	  
			driver.get("https://www.google.com/");
			String actTitle = driver.getTitle();
			String expTitle = "Google";
			Assert.assertEquals(actTitle,expTitle);
			System.out.println("result: "+ actTitle);
			
		}
		@BeforeTest
		public void setup() {
			
			System.out.println("Setting up Test");
			 driver = utilities.DriverFactory.open("chrome");
			
		}
		@AfterTest
		public void complete() {
			
			System.out.println("Test completed");
			driver.close();
		}
  }