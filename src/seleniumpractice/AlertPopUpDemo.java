package seleniumpractice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopUpDemo {

	

			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium common jar's\\chromedriver.exe");
				WebDriver d=new ChromeDriver();
				d.get("https://mail.rediff.com/cgi-bin/login.cgi");
				d.findElement(By.name("proceed")).click();
				Thread.sleep(5000);
				Alert alert=d.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();//click on okay button
				//alert.dismiss();//click on cancel if there is cancel buttoon
				Thread.sleep(5000);
				d.close();
				
				

			}

		}


	