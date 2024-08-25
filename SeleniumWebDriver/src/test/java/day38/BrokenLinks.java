package day38;

import java.net.HttpURLConnection;
import java.net.URL;

/*
1.The link should have a href attribute
2.Hit the "url" to the server and capture the status code
3.Error code >= 400 ---> Broken Links
Error code < 400 ---> Not a broken links

 */

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		//http://www.deadlinkcity.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//Capturing all the links from webpage
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on webpage is:" + links.size());
		
		int noOfBrokenLinks = 0;
		
		//Checking whether the link should have href attribute or not
		for(WebElement linkElement:links)
		{
			String hrefattvalue=linkElement.getAttribute("href");
			if(hrefattvalue==null || hrefattvalue.isEmpty())
			{
				System.out.println("href attribute value is empty or null. So not possible to check");
				continue;
			}
			
			//Hit the "url" to the server and capture the status code
			try
			{
				URL linkURL = new URL(hrefattvalue);
				HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection();
				conn.connect();
				
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hrefattvalue + "------> Broken Link");
					noOfBrokenLinks++;
				}
				else
				{
					System.out.println(hrefattvalue + "------> Not Broken Links");
				}
			}
			catch (Exception e) 
			{
			}
		
		}
		System.out.println("Number of broken link is: " + noOfBrokenLinks);
		
		

	}

}
