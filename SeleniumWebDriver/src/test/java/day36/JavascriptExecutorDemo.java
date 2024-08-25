package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		
		// https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.id("name"));
		
		//Using javascript methods to send the inputs instead of using normal sendkeys methods 
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Sabari')",name);
		
		//Using javascript methods to perform the click instead of using normal click methods 
		WebElement button=driver.findElement(By.id("male"));
		js.executeScript("arguments[0].click()",button);

	}

}
