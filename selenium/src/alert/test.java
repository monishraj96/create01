package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement click = driver.findElement(By.name("proceed"));
		click.click();
		Alert k=driver.switchTo().alert();
		String name=k.getText();
		System.out.println(name);
		k.accept();
		
	}

}
