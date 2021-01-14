package seleniumpractice;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowndemo {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://newtours.demoaut.com/mercurysignon.php");
		d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")).sendKeys("indramohan925@gmail.com");
		d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("8985219256");
		d.findElement(By.name("login")).click();
		
	//List<WebElement> list=d.findElements(By.tagName("option"));
	WebElement	f=d.findElement(By.name("passCount"));
	WebElement g=d.findElement(By.name("fromPort"));
	Select dropdown = new Select(f); 
	Select dropdown1 = new Select(g); 
	
	Thread.sleep(4000);
	dropdown.selectByValue("2");
  dropdown1.selectByIndex(1);
  System.out.println(dropdown.isMultiple());
	//dropdown.deselectByValue("2");
	
		

	}

}
