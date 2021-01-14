package seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddropDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.globalsqa.com/demo-site/draganddrop/");
		d.manage().window().maximize();
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		
		Actions action=new Actions(d);
		//action.clickAndHold(d.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"))).moveToElement(d.findElement(By.xpath("//*[@id='trash']"))).release().build().perform();
	    
		 Thread.sleep(3000);
	     WebElement source=	d.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	     Thread.sleep(4000);
	     WebElement destination=d.findElement(By.xpath("//div[@id='trash']"));
		 action.dragAndDrop(source,destination).build().perform();
		
		   Thread.sleep(5000);
		   d.close();
		   
		
	}

}
