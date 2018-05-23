package seleniummukesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newcalender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();    
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies(); //delete all cookies
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.freecrm.com");
		 WebElement id = driver.findElement(By.name("username"));
	        WebElement pass = driver.findElement(By.name("password"));
	        id.sendKeys("naveenk");
	        pass.sendKeys("test@123");
	  driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	  driver.switchTo().frame("mainpanel");
	  // (or)driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='MasterPass_frame']")));
	  driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	 // driver.findElement(By.xpath("*//a[contains(text(),'CONTACTs')]")).click();
	 // Select dropdown = new Select(driver.findElement(By.id("CONTACTs")));
	  //dropdown.selectByVisibleText("New Contact"); 
	  //*[@id='vContactsForm']/table/tbody/tr[4]/td[1]/input
	  //*[@id='vContactsForm']/table/tbody/tr[5]/td[1]/input
	  //*[@id='vContactsForm']/table/tbody/tr[5]/td[1]/input
	  //*[@id='vContactsForm']/table/tbody/tr[5]/td[1]/input
	  //*[@id='vContactsForm']/table/tbody/tr[19]/td[1]/input
	 String befor_xpath ="  //*[@id='vContactsForm']/table/tbody/tr[";
	 String after_xpath ="]/td[1]/input";
	 for(int i=4; i<=19; i++){
	String name = driver.findElement(By.xpath(befor_xpath+i+after_xpath)).getText();
	System.out.println(name);
	 }
	//String name = driver.findElement(By.xpath(befor_xpath+i+after_xpath)).getText();
	}
	
}
