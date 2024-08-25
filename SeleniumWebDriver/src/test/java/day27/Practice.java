package day27;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Practice:

https://testautomationpractice.blogspot.com/ 

1.Provide some string search for it
2.Count number of links
3.Click on each link using for loop
4.get the window id's for every browser windows
5.Close specific browser window
*/

public class Practice {

	public static void main(String[] args) {
		
		
		// https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		List<WebElement> links= driver.findElements(By.xpath("//*[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		System.out.println("Number of search link count is: " + links.size());
		
		System.out.println("Clicking the all the links");
		for(WebElement open:links)
		{
			System.out.println(open.getText());
			open.click();
		}
		
		System.out.println("Collecting WindoIDs for all the windows");
		Set<String> windowids =driver.getWindowHandles();
		System.out.println(windowids);
		
		System.out.println("Switching the windows");
		
		for(String winid:windowids)
		{
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
		if(title.equals("Selenium (software) - Wikipedia"))
		{
			driver.close();
		}


	}
		
	}

}
