package Pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchpage {
	
	WebDriver driver;
	
	
	public void search(String val1) {
		
		driver.findElement(By.name("q")).sendKeys(val1);
		driver.findElement(By.id("gb_70")).click();
	}
	
	public searchpage(WebDriver driver) {
		
		this.driver=driver;
		
	}

}
