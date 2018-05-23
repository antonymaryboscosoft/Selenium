package seleniummukesh;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Drapdown2 {
	@Test
	public void selectDDValues() throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\Downloads\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement month_dropdown=driver.findElement(By.id("month"));
Select month_dd=new Select(month_dropdown);
List<WebElement>month_list=month_dd.getOptions();
int total_month=month_list.size();
Assert.assertEquals(total_month, 13);
System.out.println("Total month count is"+total_month);
//variable (any)
for(WebElement any:month_list)
{
String month_name=any.getText();
System.out.println("months are------"+month_name);

}
}}
