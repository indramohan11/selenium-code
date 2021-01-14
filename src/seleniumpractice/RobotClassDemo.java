package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Thread.sleep(2000);
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		Thread.sleep(4000);
		Robot r= new Robot();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@title='Search']")).click();
		r.keyPress('R');
		r.keyPress('A');
		r.keyPress('N');
		r.keyPress('G');
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        d.close();

	}

}


