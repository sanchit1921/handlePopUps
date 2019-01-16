package FirstScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	WebDriver  driver;
	public void invokebrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	
	public void navigateCommands() throws InterruptedException{
		driver.navigate().to("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[start-width((text),'Appliances')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Microwave ovens')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	}
	
	public  static void main(String arg[]) throws InterruptedException{
		NavigateCommands nav = new NavigateCommands();
		nav.invokebrowser();
		nav.navigateCommands();
	}

}
