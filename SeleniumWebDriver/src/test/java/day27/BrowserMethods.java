package day27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

public static void main(String[] args) throws InterruptedException {
		
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Thread.sleep(5000);
	
	//driver.close();
	driver.quit();
	
	//https://testautomationpractice.blogspot.com/
	
	
	
	
	
		
	}

}
