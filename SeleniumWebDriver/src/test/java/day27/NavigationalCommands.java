package day27;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		// https://demo.nopcommerce.com/
		//https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://demo.nopcommerce.com/"); ---> Get methods accepts the URL in String format only
		
		//driver.navigate().to("https://demo.nopcommerce.com/); ---> This method accepts the URL in both String and Object types
		
		//URL myurl = new URL("https://demo.nopcommerce.com/"); 
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		

	}

}
