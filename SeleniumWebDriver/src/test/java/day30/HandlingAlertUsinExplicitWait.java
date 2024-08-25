package day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertUsinExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// https://the-internet.herokuapp.com/javascript_alerts
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));   //Explicit Wait Declaration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		
		//Using explicit wait we can capture the alert 
		
		Alert myalert =mywait.until(ExpectedConditions.alertIsPresent());
		myalert.dismiss();
		
	

	}

}
