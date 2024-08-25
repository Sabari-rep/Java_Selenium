package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		// https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Finding the total pages
		int total_pages=driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		System.out.println("Total pages on the Pagination table is: " + total_pages);
		
		//Switching the pages one by one
		for(int p=1; p<=total_pages; p++)
		{
			if(p>1)
			{
			WebElement active_page=driver.findElement(By.xpath("//ul[@id='pagination']//li["+p+"]"));
			active_page.click();
			Thread.sleep(4000);
			}
		
			//Printing the data from each pages
			int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr")).size();
			//int columns= driver.findElements(By.xpath("//table[@id='productTable']//thead//tr//th")).size();
			
			
			for(int r=1; r<=rows; r++)
			{
				
					String id=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td["+1+"]")).getText();
					String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td["+2+"]")).getText();
					String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td["+3+"]")).getText();
					driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input")).click();
					
				System.out.println(id+" "+name+" "+price+" ");
			}
			
			
		
		
		}
		
		


	}

}
