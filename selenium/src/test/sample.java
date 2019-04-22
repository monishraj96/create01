package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sample {
	public static void main(String[] args) {
		//set the property
		System.setProperty("webdriver.gecko.driver", "E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\geckodriver.exe");
		//launch browser
		WebDriver driver=new FirefoxDriver();
		//enter url
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
		driver.get("http://www.greenstechnologys.com/");
		//quit
		driver.quit();
		
		
		//set the property
		System.setProperty("webdriver.chrome.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
		//launch browser
		WebDriver driver1=new ChromeDriver();
		//enter url
		driver1.get("https://www.facebook.com/");
		driver1.get("https://www.amazon.in/");
		driver1.get("http://www.greenstechnologys.com/");
		//quit
		driver1.quit();
		
		
		//set the property
		System.setProperty("webdriver.ie.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\IEDriverServer.exe");
		//launch browser
		WebDriver driver2=new InternetExplorerDriver();
		//enter url
		driver2.get("https://www.facebook.com/");
		driver2.get("https://www.amazon.in/");
		driver2.get("http://www.greenstechnologys.com/");
		//quit
		driver2.quit();
	}

}
