package day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		// https://books-pwakit.appspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		/*
		SearchContext shadow0=driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		
		SearchContext shadow1= shadow0.findElement(By.cssSelector("app-header[condenses reveals effects='waterfall']")).getShadowRoot();
		Thread.sleep(1000);
		
		SearchContext shadow2=shadow1.findElement(By.cssSelector("app-toolbar[class='toolbar-bottom']")).getShadowRoot();
		Thread.sleep(1000);
		
		SearchContext shadow3=shadow2.findElement(By.cssSelector("book-input-decorator")).getShadowRoot();
		Thread.sleep(1000);
		
		shadow3.findElement(By.cssSelector("#input")).sendKeys("Welcome");	
		*/
		
		
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");
	}

}
