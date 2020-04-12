package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTestNG {
	
	@Test
	public void smokeTestLogin() {
		
		WebDriver driver = utilities.DriverFactory.open("chrome");
		driver.get("https://www.google.com");
		
		boolean search = driver.findElement(By.name("q")).isDisplayed();
		
		Assert.assertTrue(search, "Text box present");
		driver.close();
	}

}
