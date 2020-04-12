package StepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BDDSearchTest {
	
	WebDriver driver;
	//Given User is on the search page
	@Given("^User on search page$")
	public void search() {
		System.out.println("user is on search page");
		
		driver = utilities.DriverFactory.open("chrome");
		driver.get("https://www.google.com");
		
	}
		
	//When User enters the search details
	@When("^user enter criteria$")
	public void EnterDetails() {
		driver.findElement(By.name("q")).sendKeys("hello Friends");
		
	}
	//Then User get the search result
	@Then("^user see's the details$")
	public void result() {
		System.out.println("Sucess");
	}
}
