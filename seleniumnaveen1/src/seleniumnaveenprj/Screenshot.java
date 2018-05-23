package seleniumnaveenprj;
//class 12
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws  IOException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
//		Take screen shot
		Thread.sleep(2000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils. copyFile(src, new File("E:/anto/eclpslunapom/seleniumnaveen1/src/seleniumnaveenprj/facebook.png"));
		System.out.println("screen shot has been taken");
	driver.quit();
}
	
	}
