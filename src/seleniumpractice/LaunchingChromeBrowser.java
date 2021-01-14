package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe\\");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		System.out.print(d.getTitle().length());
		Thread.sleep(4000);
		d.findElement(By.linkText("Gmail")).click();
		d.findElement(By.linkText("Sign in")).click();
		Set<String> win=d.getWindowHandles();
		String win2=null;
		String win3=null;
		for(String win1:win)
		{
			 win2=win1;
			 win3=win1;
		}
		System.out.println(win);
		d.switchTo().window(win3);
		d.findElement(By.xpath("//input[@type='email']")).sendKeys("abcde");
		Thread.sleep(4000);
		//d.navigate().back();
		d.findElement(By.xpath("//input[@type='email']")).clear();
		//d.navigate().refresh();
		Thread.sleep(4000);
		
		
		d.close();
	    d.quit();
		

	}

}
