
package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\\\java software\\\\eclipse\\\\monish\\\\selenium\\\\lib\\\\webDriver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> trows = driver.findElements(By.tagName("tr"));
for (int i = 0; i < trows.size(); i++) {
	WebElement eachrow=trows.get(i);
	List<WebElement> tdata = driver.findElements(By.tagName("td"));
	for (int j = 0; j < tdata.size(); j++) {
		WebElement eachdata=tdata.get(j);
		String name=eachdata.getText();
		System.out.println(name);
		if (name.equals("China")) {
			tdata.get(4).click();
			System.out.println(tdata);
			
		}
	}
	
}	
	
}
}
