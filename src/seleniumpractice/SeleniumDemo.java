package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.switchTo().frame("id=");
		
		driver.findElement(By.name("q")).sendKeys("java");
		
		driver.navigate().back();
		Dimension d=new Dimension(220,220);
		//Point p=new Point(1400,300);
		//driver.manage().window().setPosition(p);
	//	driver.manage().window().setSize(d);
	//	driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();

	}

}
