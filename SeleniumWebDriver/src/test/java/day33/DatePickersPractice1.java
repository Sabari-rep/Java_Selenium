package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickersPractice1 {
	
	
	static void dobdate(WebDriver driver, String birthyear, String birthmonth, String birthdate)
	{
		//DOB Method
		
		//Selecting Year
				WebElement byear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select dropdownYear = new Select(byear);
				dropdownYear.selectByVisibleText(birthyear);
				
				//Selecting Month
				WebElement bmonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
				Select dropdownMonth = new Select(bmonth);
				dropdownMonth.selectByVisibleText(birthmonth);
				
				//Selecting Date
				
				
				List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));		
				
				for(WebElement dt:dates)
				{
					if(dt.getText().equals(birthdate))
					{
						dt.click();
						break;
					}
				}
	}
	
	static void depdate(WebDriver driver, String depyear, String depmonth, String depdate)
	{
		
		//Departure Date Method
		//Selecting Year
				WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select dropdownYear = new Select(year);
				dropdownYear.selectByVisibleText(depyear);
				
				//Selecting Month
				WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
				Select dropdownMonth = new Select(month);
				dropdownMonth.selectByVisibleText(depmonth);
				
				//Selecting Date
				
				
				List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));		
				
				for(WebElement dt:dates)
				{
					if(dt.getText().equals(depdate))
					{
						dt.click();
						break;
					}
				}
	}
	
	
	static void retudate(WebDriver driver, String reyear, String remonth, String redate)
	{
		
		//Return  Date Method
		//Selecting Year
				WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select dropdownYear = new Select(year);
				dropdownYear.selectByVisibleText(reyear);
				
				//Selecting Month
				WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
				Select dropdownMonth = new Select(month);
				dropdownMonth.selectByVisibleText(remonth);
				
				//Selecting Date
				
				
				List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr//td//a"));		
				
				for(WebElement dt:dates)
				{
					if(dt.getText().equals(redate))
					{
						dt.click();
						break;
					}
				}
	}
	


	public static void main(String[] args) {
		
		
		// https://www.dummyticket.com/dummy-ticket-for-visa-application/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("product_549")).click();
		
		driver.findElement(By.id("travname")).sendKeys("Sabarikarthik");
		driver.findElement(By.id("travlastname")).sendKeys("G");
		
		driver.findElement(By.id("dob")).click();
		//DOB input
		

		dobdate(driver, "1999", "Sep", "5");
		
		driver.findElement(By.id("sex_1")).click();
		driver.findElement(By.id("traveltype_2")).click();
		driver.findElement(By.id("fromcity")).sendKeys("Chennai");
		driver.findElement(By.id("tocity")).sendKeys("Madurai");
		
		
		//Dep Input
		driver.findElement(By.id("departon")).click();
		depdate(driver,"2024", "Sep", "5");
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		//Return input
		driver.findElement(By.id("returndate")).click();
		retudate(driver, "2025", "Jan", "26");
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	
		driver.findElement(By.id("billing_phone")).sendKeys("9876543021");
		driver.findElement(By.id("billing_email")).sendKeys("abc@gmail.com");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='billing_country']"));
		Select billingcountry = new Select(country);
		List<WebElement> countrycount = billingcountry.getOptions();
		System.out.println("Billing country count is:" + countrycount.size());
		
		for(int i=0; i<=countrycount.size(); i++)
		{
			WebElement op = countrycount.get(i);
			String bcountry=op.getText();
			
			if(bcountry.equals("India"))
			{
				op.click();
				break;
			}
				
		}
		
		WebElement state=driver.findElement(By.xpath("//select[@id='billing_state']"));
		Select billingstate = new Select(state);
		List<WebElement> statecount = billingstate.getOptions();	
		System.out.println("Billing State count is: " + statecount.size());
		
		for(int i=0; i<=statecount.size(); i++)
		{
			WebElement op1=statecount.get(i);
			String bstate=op1.getText();
			
			if(bstate.equals("Tamil Nadu"))
			{
				op1.click();
				break;
			}
		}
	}
		

}

