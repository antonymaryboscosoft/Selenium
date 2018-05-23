package seleniumnaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertandpopupmsg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\Downloads\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
				
			if(text.equals("please enter a valid user name")){
				System.out.println("correct alert message");
			}else{
				System.out.println("wrong alert message");
			
				}
		alert.accept();
		
		driver.quit();
		
	}
}
