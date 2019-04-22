package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtcheck = driver.findElement(By.xpath("//span[contains(text(),'Create')]"));
	String name=txtcheck.getText();
	System.out.println(name);
	driver.quit();
	
	
	}

}
