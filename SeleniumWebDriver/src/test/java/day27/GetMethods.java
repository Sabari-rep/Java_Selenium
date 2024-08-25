package day27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		WebDriver driver = new ChromeDriver();
		
		//get(url) ----> Used to opens the URL on browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//getTitle() ----> Used to returns the title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() ---> Used to return the URL of the current page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()  ---> Used to get the source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() ---> Used to return the ID of the single browser window
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles() ----> Used to return the ID's of the multiple browser windows
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> windowIDs=driver.getWindowHandles();
		System.out.println(windowIDs);

		
		



		

	}

}
