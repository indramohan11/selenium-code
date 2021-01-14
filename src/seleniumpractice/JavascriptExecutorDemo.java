package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium common jar's\\chromeDrive\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		d.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		d.manage().window().maximize();
		
		//to enter text in text data without using javascriptexecutor.
	//	js.executeScript("document.getElementById('identifierId').value='indramohan925';");
		
		//to click a button using Javascriptexecutor
		
	 //  WebElement e=d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	//    js.executeScript("arguments[0].click();",e);
		
		//or
		//js.executeScript("document.getElementByXpath('//span[@class='RveJvd snByac']'.click();");
		
		//to generate Alert Pop window in selenium
	     
	//    js.executeScript("alert('hello world');");
	     
		
	    //to refresh browser window using Javascript 
	     Thread.sleep(4000);
	      
	//   js.executeScript("history.go(0)");
	     
	    // to get innertext of the entire webpage in Selenium
	     
	  String sText =  js.executeScript("return document.documentElement.innerText;").toString();
	 System.out.println(sText);
	     
	    //to get the Title of our webpage
	     
	     String sText1 =  js.executeScript("return document.title;").toString();
	     System.out.println(sText1);
	     
	     //to get the domain
	    String sText2 =  js.executeScript("return document.domain;").toString();
	    System.out.println(sText2);
	     
	     //to get the URL of our webpage
	     
	     String sText3 =  js.executeScript("return document.URL;").toString();
	    System.out.println(sText3);
	     
	    //to perform Scroll on application using  Selenium
	     //Vertical scroll - down by 50  pixels
	     
	   js.executeScript("window.scrollBy(0,50)");
	     
	     // for scrolling till the bottom of the page we can use the code like
	   
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     
	    
	     
	     //to navigate to different page using Javascript?
	             //Navigate to new Page
	            js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");
	     }
	    }
		
		
		
		
		
