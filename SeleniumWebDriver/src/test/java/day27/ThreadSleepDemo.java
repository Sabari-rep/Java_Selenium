package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepDemo {

	public static void main(String[] args) throws InterruptedException {
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("sabari");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Sabari@05");
		

	}

}
