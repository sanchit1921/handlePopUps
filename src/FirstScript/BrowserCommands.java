package FirstScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
WebDriver driver ;
	
	public void invokeBrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com");
		
		driver.close();
	}
	public  static void main(String arg[]) throws InterruptedException{
		BrowserCommands nav = new BrowserCommands();
		nav.invokeBrowser();
	}
}
