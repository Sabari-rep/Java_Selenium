package day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		// https://the-internet.herokuapp.com/javascript_alerts
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Handling Normal Alert
		/*
		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		*/
		
		//Alert myalert = driver.switchTo().alert();
		//myalert.accept();
		
		//Confirmation Alert Ok or Cancel
		/*
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		*/
		
		//Prompt Alert
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.sendKeys("Welcome Sabari");
		myalert.dismiss();
		
		String result = driver.findElement(By.id("result")).getText();
		
		if(result.contains("Welcome Sabari"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		

	}

}
