package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
	WebElement btnnew = driver.findElement(By.xpath("//a[text()='New User Activation']"));
	btnnew.click();
	String pwid=driver.getWindowHandle();
	System.out.println(pwid);
	Set<String>allwindows=driver.getWindowHandles();
	System.out.println(allwindows);
	for (String windowid : allwindows) {
		if (!pwid.equals(windowid)) {
			driver.switchTo().window(windowid);}}
	WebElement btnent = driver.findElement(By.id("fldUId"));
	btnent.sendKeys("3251354354");
	WebElement submit = driver.findElement(By.xpath("//a[@onclick='return userSubmit();']"));
	submit.click();
	WebElement otp = driver.findElement(By.xpath("//td[@class='ColHeadingLeftAlignedBold']"));
	String name=otp.getText();
	System.out.println(name);
	
	}

		}
		
	


