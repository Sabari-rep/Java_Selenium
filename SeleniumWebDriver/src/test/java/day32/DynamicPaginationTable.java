package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		// https://demo.opencart.com/admin/index.php
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if(driver.findElement(By.xpath("//button[@type='button']")).isDisplayed());
		{
			driver.findElement(By.xpath("//button[@type='button']")).click();
		}
		
		//Selecting Customer tab
		driver.findElement(By.xpath("//a[@class='parent']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//li[1]")).click();
		
		//Showing 1 to 10 of 20418 (2042 Pages)
		String text= driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		//Visiting the pages one by one
		for(int p=1; p<=total_pages; p++)
		{
			if(p>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			
		//Reading the table data
			
			int rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			
			for(int r=1; r<=rows; r++)
			{
				String customer_name=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				
				System.out.println(customer_name +" "+ email);
			}
			
		}
	}

}
