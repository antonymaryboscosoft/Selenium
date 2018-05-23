package seleniumnaveenprj;
//class 12
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Handlessbrowser {
	@Test
//	public void htmlUnitDriverTest() throws InterruptedException{

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();  
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(2000);
		
		System.out.println("Beforlogin, title is ;====="+driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
//		own xpath creation
		driver.findElement(By.xpath("//input[@type='submit']")).click();;
		Thread.sleep(5000);
		
		System.out.println("Afterlogin, title is ;====="+driver.getTitle());
	}
}
