package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class byindex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement dDnmonths = driver.findElement(By.id("selenium_commands"));
		Select s=new Select(dDnmonths);
		
		//this is to select the values by index
		//s.selectByIndex(4);
		//s.selectByIndex(1);
		
		//to get access in the list of web element the following command is used:
		List<WebElement> emp=s.getOptions();
		
		//using normal for loop
		//for (int i = 0; i < emp.size(); i++) {
			//s.selectByIndex(i);}
			
		
		//enhanced for loop
		//for (WebElement w : emp) {
			//select all options by index
			//w.sele
			
			
		//}
		    //(to print particular value from the list:
			//WebElement o=emp.get(2);
			//String name=o.getText();
             //System.out.println(name);}		


		//(to print all the values from the list:
			//String name=w.getText();
			//System.out.println(name); }
			
		}
		}


