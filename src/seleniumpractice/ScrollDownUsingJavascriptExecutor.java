package seleniumpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUsingJavascriptExecutor 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)d;
		d.get("http://moneyboats.com/");
		d.manage().window().maximize();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		d.close();
		
		
		
		

	}

}
