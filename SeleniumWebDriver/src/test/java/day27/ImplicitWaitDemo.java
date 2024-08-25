package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	
	//****Default time for Implicit wait is "ZERO" Seconds.

	public static void main(String[] args) {
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("username")).sendKeys("sabari");
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Sabari@05");
		
		
		
		
	}

}
