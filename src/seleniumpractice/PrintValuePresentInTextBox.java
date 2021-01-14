package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValuePresentInTextBox 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		WebElement e=d.findElement(By.xpath("//input[@type='text']"));
		String s=e.getAttribute("Search");
		System.out.print(s);
		



	}

}
