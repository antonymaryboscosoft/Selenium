package seleniummukesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Titleverify {
	@Test
	public void VerifyApplicationTitle(){
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/");
		String my_title=driver.getTitle();
		System.out.println("This is "+my_title);
		String expected_title="Selenium Webdriver Tutorial- Free Selenium Tutorial";
		//Assert.assertEquals(my_title, expected_title);
		Assert.assertTrue(my_title.contains("Selenium Webdriver Tutorials"));
		System.out.println("Test completed");
		
	}

}
