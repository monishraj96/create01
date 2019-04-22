package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {
	public static void main(String[] args) {
		
	
	
	//set the property
	System.setProperty("webdriver.chrome.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
	//launch browser
	WebDriver driver2=new ChromeDriver();
	
	//enter url
	driver2.get("https://www.facebook.com/");
	driver2.navigate().to("https://www.amazon.in/");
	driver2.navigate().back();
	driver2.navigate().forward();
	driver2.navigate().refresh();
	//quit
	driver2.quit();

}
}