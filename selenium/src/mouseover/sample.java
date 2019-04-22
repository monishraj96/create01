package mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement btncourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions d=new Actions(driver);
		d.moveToElement(btncourse).perform();
		WebElement btorac = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		d.moveToElement(btorac).perform();
		btorac.click();
	}

}
