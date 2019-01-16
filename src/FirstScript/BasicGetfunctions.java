package FirstScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicGetfunctions {
	WebDriver driver;
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
	}
	public void getCommands(){
		driver.get("http://www.officedepot.com");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		String url = driver.getCurrentUrl();
		System.out.println("url is ---->"+url);
		String pageSource = driver.getPageSource();
		System.out.print(pageSource);
	}
	public static void main(String arg[]){
		BasicGetfunctions getFunctions = new BasicGetfunctions();
		getFunctions.invokeBrowser();
		getFunctions.getCommands();
	}

}
