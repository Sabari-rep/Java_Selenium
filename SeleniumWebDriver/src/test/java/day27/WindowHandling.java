package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//Approach1
		/*
		List<String> windowlist = new ArrayList(windowIDs);
 		String parentID = windowlist.get(0);
 		String childID = windowlist.get(1);
 		
 		
 		//switcTo() childwindow
 		driver.switchTo().window(childID);
 		System.out.println(driver.getTitle());
 		
 		//switchTo() to parentwindow
 		driver.switchTo().window(parentID);
 		System.out.println(driver.getTitle());
 		
 		*/
		
		//Approach2
		
		for(String winID:windowIDs)
		{
			String title = driver.switchTo().window(winID).getTitle();
		
		//if you want perform any validation on any window you can use if condition and perform the required validation
		if(title.equals("OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
		}
		
		
		}

	}

}
