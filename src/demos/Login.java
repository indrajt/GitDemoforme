package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val="Hello World";
		String browserType="chrome";
		WebDriver driver;
		
		driver = utilities.DriverFactory.open(browserType);
		
		//System.setProperty("webdriver.chrome.driver", "C:\\sw\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(val);
		//driver.findElement(By.name("q")).sendKeys(val);
		driver.findElement(By.id("gb_70")).click();
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("Browser Title is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("This is for GIT1");
		System.out.println("This is for git2");
		System.out.println(driver.getPageSource());
		if (url=="https://www.google.com/")
			System.out.println("Test FAILED");
		
		else
			System.out.println("TEST PASSED");
		 
		driver.close();
		driver.quit();
		
	}

}
