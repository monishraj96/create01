package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\java software\\\\eclipse\\\\monish\\\\selenium\\\\lib\\\\webDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement conclick = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a=new Actions(driver);
		//context click
		a.contextClick(conclick).perform();
		//robot
		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		for (int i = 0; i <= 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		
	}

}
