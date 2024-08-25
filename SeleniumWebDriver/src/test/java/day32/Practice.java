package day32;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// https://blazedemo.com/
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//Selecting departure country
		WebElement depcountry = driver.findElement(By.name("fromPort"));
		depcountry.click();
		
		Select fromcountry = new Select(depcountry);
		fromcountry.selectByVisibleText("Paris");
		
		//Selecting Destination Country
		WebElement descountry = driver.findElement(By.xpath("//select[@name='toPort']"));
		descountry.click();
		
		Select tocountry = new Select(descountry);
		tocountry.selectByValue("Berlin");
		
		//Clicking find flights search button
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//Counting Number of rows in webpage table
		
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("Number of rows in table is: " + rows);
		
		//Capturing the prices and stored in array
		
		String priceArr[] = new String[rows];
		
		for(int r=1; r<=rows; r++)
		{
			String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
			priceArr[r-1] = price;
		}
		
		//sort the price and then find the lower value
		for(String arrvalue:priceArr)
		{
			System.out.println(arrvalue);
		}
		Arrays.sort(priceArr);
		String lowestPrice = priceArr[0];
		System.out.println("Lowest price: " + lowestPrice);
		
		//Find the record in table for lower price
		for(int r=1; r<=rows; r++)
		{
			String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
			
			if(price.equals(lowestPrice))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[1]//input")).click();
				break;
			}
		}
		
		//Filling the details
		driver.findElement(By.name("inputName")).sendKeys("Sabarikarthik");
		driver.findElement(By.id("address")).sendKeys("East Street");
		driver.findElement(By.id("city")).sendKeys("Aruppukottai");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamil Nadu");
		driver.findElement(By.cssSelector("input#zipCode")).sendKeys("626104");
		driver.findElement(By.id("creditCardNumber")).sendKeys("6261040000456");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys("2023");
		driver.findElement(By.id("nameOnCard")).sendKeys("Sabarikarthik");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		//Final message Validation
		String message= driver.findElement(By.xpath("//h1")).getText();
		
		if(message.contains("Thank you for your purchase today!"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
	}

}
