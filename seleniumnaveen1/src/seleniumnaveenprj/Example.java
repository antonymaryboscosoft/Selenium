package seleniumnaveenprj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
	WebDriver driver = new ChromeDriver();  
	driver.manage().window().maximize();
	driver.get("https://www.freecrm.com/index.html");
}
}
