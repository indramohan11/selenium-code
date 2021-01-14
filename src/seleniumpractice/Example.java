package seleniumpractice;
import java.text.ParseException;
import java.util.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



	public class Example {
	    public static void main(String[] args) throws ParseException, InterruptedException {
	    	WebDriver wd;
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe");
		  wd= new ChromeDriver();
	        wd.get("http://demo.guru99.com/test/web-table-element.php");         
	        //No.of Columns
	        List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        
	        List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        Thread.sleep(4000);
	        wd.close();
	    }
	}