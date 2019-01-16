package FirstScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureScreenShot {
	public static void main(String arg[]) throws IOException{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try{
			
		driver.get("https://www.softwaretestingmaterial.com");
		 driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); 
		}
		catch(Exception e){
		File Screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		org.apache.commons.io.FileUtils.copyFile(Screenshotfile, new File("D:\\SoftwareTestingMaterial.png"));
		}
		
	}
}
