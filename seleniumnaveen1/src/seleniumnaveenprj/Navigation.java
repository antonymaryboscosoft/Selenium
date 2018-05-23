package seleniumnaveenprj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
	WebDriver driver = new ChromeDriver();  
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.amazon.com");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();
}
}
