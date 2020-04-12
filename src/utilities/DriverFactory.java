package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverFactory {
	public static WebDriver open(String browserType) {
		if (browserType.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\sw\\chromedriver.exe");
		return new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver", "C:\\sw\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
	}

}
