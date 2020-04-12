package Test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@RunWith(value = Parameterized .class)

public class DDTesting {
	String data;
	@Test
	public void datadrivTest() {
		
		System.out.println("New recod:  "+data);
		WebDriver driver = utilities.DriverFactory.open("chrome");
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(data);
		
		driver.close();
	}
	@Parameters
	public static List<String[]> getData(){
		
		return utilities.CSVRead.get("C:\\Users\\483226\\Desktop\\file1.csv");
		
	}
	public DDTesting(String data) {
	this.data = data; }
}
