package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptns {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement dDnmonths = driver.findElement(By.id("month"));
	Select s=new Select(dDnmonths);
	List<WebElement> emp=s.getOptions();
	//for (int i = 0; i < emp.size(); i++) {
		//WebElement w=emp.get(i);
		//String name=w.getText();
		//System.out.println(name);
		//}
	//another method: using enhanced loop
	
	System.out.println("enhanced for loop");
	for (WebElement v : emp) {
		String name=v.getText();
		//String name=v.getAttribute("value");
		System.out.println(name);
		
	}
		
	
	driver.quit();
}

}


