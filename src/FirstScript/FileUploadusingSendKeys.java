package FirstScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadusingSendKeys {
	WebDriver driver;
	public void invoke() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(10000);
		WebElement browse =driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(10000);
		 browse.sendKeys("C:\\Users\\ParveenGupta\\Desktop\\Linux Commands.doc");
		 driver.close();
	}
	public static void main(String arg[]) throws InterruptedException{
		FileUploadusingSendKeys upload = new FileUploadusingSendKeys();
		upload.invoke();
	}
}
