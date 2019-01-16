package FirstScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScriptClass {
	WebDriver driver ;
	
	public void invokeBrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com");
		putPassword();
	}
	
	public void putPassword() throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).click();
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("guptatripti2191");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac' and contains(.,'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("tripo@1234");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac' and contains(.,'Next')]")).click();
		
	}
	
	public static void main(String arg[]) throws InterruptedException{
		FirstScriptClass first = new FirstScriptClass();
		first.invokeBrowser();
	}
}
