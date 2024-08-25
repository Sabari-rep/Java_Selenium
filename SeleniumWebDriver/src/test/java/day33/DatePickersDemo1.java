package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickersDemo1 {

	static void  SelectFutureDate(WebDriver driver, String year, String month, String date)
	{
		//Selecting Year & Month
		while(true)
		{
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(currentyear.equals(year) && currentmonth.equals(month) )
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //For Future
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //For Past
		}
		
		//Selecting the date
				List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				
				for(WebElement dt:dates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
						
					}
				}
		
		
	}
	
	static void  SelectPastDate(WebDriver driver, String year, String month, String date)
	{
		//Selecting Year & Month
		while(true)
		{
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(currentyear.equals(year) && currentmonth.equals(month) )
			{
				break;
			}
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //For Future
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //For Past
		}
		
		//Selecting the date
				List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				
				for(WebElement dt:dates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
						
					}
				}
		
		
	}

	public static void main(String[] args) {
		
		// https://jqueryui.com/datepicker/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		//Method 1 - Using Sendkeys methods
		//driver.findElement(By.id("datepicker")).sendKeys("07/18/2024");
		
		//Method 2 - Using Date Pickers
		
		driver.findElement(By.id("datepicker")).click();
		
		//SelectFutureDate(driver,"2026","September","5");
		SelectPastDate(driver,"2008","September","5");
	
	}

}
