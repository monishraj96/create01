import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","E:\\java software\\eclipse\\monish\\selenium\\lib\\webDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot s=(TakesScreenshot)driver;
	File g=s.getScreenshotAs(OutputType.FILE);
	System.out.println(g);
	File m=new File("E:\\java software\\screenshot\\facebook.png");
	FileUtils.copyFile(g, m);
	driver.quit();
	
}

}
