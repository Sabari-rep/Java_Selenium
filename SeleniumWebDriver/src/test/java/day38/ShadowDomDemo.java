package day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// https://dev.automationtesting.in/shadow-dom
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		//Finding Multi-nested shadow DOM
		
		SearchContext shadow0= driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(2000);
		
		SearchContext shadow1= shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(2000);
		
		SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();	
		Thread.sleep(2000);
		
		System.out.println(shadow2.findElement(By.cssSelector("#multi-nested-shadow-root")).getText());
		
		
		
		

	}

}
