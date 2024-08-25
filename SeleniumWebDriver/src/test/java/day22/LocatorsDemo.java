package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//ctrl+shift+o ----> Used to import the dependency packages

public class LocatorsDemo {

	public static void main(String[] args) {
		
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.opencart.com/");
		
		//Using Name Locator
		//--------------------
		//WebElement search_box = driver.findElement(By.name("search"));
		//search_box.sendKeys("MacBook");
		
		//driver.findElement(By.name("search")).sendKeys("MacBook");
		
		//Using ID Locator
		//------------------
		//WebElement logo = driver.findElement(By.id("logo"));
		//boolean status = logo.isDisplayed();
		
		//boolean status = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println("Display Status: " + status);
		
		
		//Using linktext and partiallinktext Locator
	   //---------------------------------------------
		
		//driver.findElement(By.linkText("Software")).click();
		//driver.findElement(By.partialLinkText("Soft")).click();
		
		//Using Classname Locator
	    //-------------------------
		
		//List <WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
		//System.out.println("The number of headerlink in webpage is: " + headerlinks.size());
		
		//Using tagname Locator
	    //-------------------------
	
		//List <WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("Total number of link in webpage is: " + links.size());
		 

		/*Practice
		https://www.demoblaze.com/index.html
		 1.Total no of links
		 2.Total no of images
		 3.Click on any product using linktext/partial linktext
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		
		//1.Total no of links
		List <WebElement> TotalNumOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(TotalNumOfLinks.size());
		
		
		//2.Total no of images
		//List <WebElement> TotalNumOfImages = driver.findElements(By.tagName("img"));
		//System.out.println(TotalNumOfImages.size());
		
		//3.Click on any product using linktext/partial linktext
		//driver.findElement(By.linkText("Contact")).click();
		 
	}

}
