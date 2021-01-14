package seleniumpractice;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe\\");
	
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebElement e=driver.findElement(By.id("email"));
		//action.click(e).build().perform();
		action.moveToElement(e).click().perform();
		action.keyDown(Keys.SHIFT).sendKeys("indramohan98@gmail.com").sendKeys(Keys.ENTER).build().perform();
		
		
		
		*////doubleclick()
		
	//	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	//	Actions action=new Actions(driver);
	//	action.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
	//	Thread.sleep(4000);
	//	driver.close();
		
		//contextClick()
		driver.get("https://www.facebook.com/");	
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.id("email"))).build().perform();
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
