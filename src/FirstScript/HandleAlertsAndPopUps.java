package FirstScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class HandleAlertsAndPopUps {
	public  void handlePopUps() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Thread.sleep(3000);
		 Alert alert = driver.switchTo().alert();
		 String text = alert.getText();
		 System.out.println(text);
		 Thread.sleep(3000);
		 alert.accept();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='content']/button")).click();
		 alert.dismiss();
		 driver.close();
	}
	

}
