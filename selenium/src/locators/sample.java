package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		
	
	
	//set the property
	System.setProperty("webdriver.chrome.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
	//launch browser
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=C7E7KFEDEACZ982W2FEX&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	WebElement mail = d.findElement(By.id("ap_email"));
     mail.sendKeys("monizraj96@gmail.com");
     WebElement password = d.findElement(By.id("ap_password"));
     password.sendKeys("ardmoniz");
     d.quit();
	}
}