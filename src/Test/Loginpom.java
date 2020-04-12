package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import Pagespom.searchpage;


public class Loginpom {
	
	@Test
	public void LoginTestPom() {
	
	WebDriver driver = utilities.DriverFactory.open("chrome");
	driver.get("https://www.google.com");
	
	searchpage searchpage = new searchpage(driver);
	searchpage.search("Hello World");
	
	driver.close(); 
	}

}
