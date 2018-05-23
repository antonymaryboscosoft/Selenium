package seleniummukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailloginpage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		String appUrl = "https://accounts.google.com";
		driver.get(appUrl);
		String expectedTitle = " Sign in-Google Accounts ";
		String actualTitle = driver.getTitle();
		 if (expectedTitle.equals(actualTitle))	 
		{
	System.out.println("Verification Successful - The correct title is displayed on the web page.");		 
 }
 else		
  {
 System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
			 
}
WebElement username = driver.findElement(By.id("Email")); 
username.clear();
username.sendKeys("TestSelenium");       
WebElement password = driver.findElement(By.id("Passwd"));              
password.clear();
password.sendKeys("password123");
WebElement SignInButton = driver.findElement(By.id("signIn"));
SignInButton.click();
driver.close();
System.out.println("Test script executed successfully.");
System.exit(0);

	}
}
