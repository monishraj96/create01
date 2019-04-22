package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/login?referer=https://www.myntra.com/");
	WebElement txtmail = driver.findElement(By.name("email"));
	
	txtmail.sendKeys("monizraj96@gmail.com");
 WebElement txtpass = driver.findElement(By.name("password"));
 txtpass.sendKeys("ardmoniz");
 WebElement btnclick = driver.findElement(By.xpath("//input[@value='male']"));
 btnclick.click();

	}

}
