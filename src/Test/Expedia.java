package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {
	WebDriver driver;
	String browserType = "chrome";
	String City = "New York";
	String CheckIn = "05/02/2021";
	String CheckOut = "05/03/2021";
	
	@Test
	public void hotelReservation() {
		
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).clear();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(City);
		driver.findElement(By.id("hotel-checkin-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(CheckIn);
		driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(CheckOut);
				
		new Select (driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/button"))).selectByValue("2");
		driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[13]/label/button")).click();
	}

	@BeforeMethod
	public void setup() {
		
		driver = utilities.DriverFactory.open(browserType);
		driver.get("http://expedia.com");
				
	}
	@AfterMethod
	public void complete() {
		
		//driver.close();
	}
}
