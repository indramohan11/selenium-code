 package seleniumpractice;

import java.io.File;

import java.io.IOException; 
import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.events.EventFiringWebDriver; 
public class ScreenShotdemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\Users\\Administrator\\Pictures\\Saved Pictures.png"));
		Thread.sleep(3000);
	    driver.close();
		
		

	}

}

