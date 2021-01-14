package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByusingContains {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.guru99.com/v1/");
		//d.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
		//Thread.sleep(4000);
		
		d.close();
		

	}

}
