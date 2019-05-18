package cucumber00;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addCustomer {
	static WebDriver driver;
	@Given("user should be in home page")
	public void user_should_be_in_home_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\java software\\eclipse\\monish\\cucumber00\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("the user should fill valid details")
	public void the_user_should_fill_valid_details() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("monish");
		driver.findElement(By.id("lname")).sendKeys("raj");
		driver.findElement(By.id("email")).sendKeys("monizraj96@gmail.com"); 
		driver.findElement(By.name("addr")).sendKeys("25 h1 peramanur");
		driver.findElement(By.id("telephoneno")).sendKeys("3546411684");
	   
	}

	@When("the user should submit after filling details")
	public void the_user_should_submit_after_filling_details() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("the user should get customer id")
	public void the_user_should_get_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[1]")).isDisplayed());
	    
	}



}
