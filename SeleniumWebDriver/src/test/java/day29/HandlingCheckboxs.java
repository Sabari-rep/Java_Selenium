package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxs {

	public static void main(String[] args) throws InterruptedException {
		
		// https://testautomationpractice.blogspot.com/ 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Selecting Check box
		/*
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='sunday']"));
		System.out.println("Is check box selected?: " + checkbox.isSelected());
		driver.findElement(By.cssSelector("input#sunday")).click();
		System.out.println("Is check box selected?: " + checkbox.isSelected());
		*/
		
		//Checking Checkbox count
		
		List<WebElement> count = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of check boxes: " + count.size());
		
		//Selecting all the checkboxes 
		/*
		for(int i=0; i<count.size(); i++)
		{
			count.get(i).click();
		}
		*/
		
		//Using enhanced for loop
		/*
		for(WebElement select:count)
		{
			select.click();
		}
		*/
		
		//Selecting last 4 check boxes
		//total number of check boxes - how many check boxes do you want to select = Starting Index
		/*
		for(int i=3; i<count.size(); i++)
		{
			count.get(i).click();
		}
		*/
		
		//Selecting first 3 check boxes
		/*
		for(int i=0; i<3;i++)
		{
			count.get(i).click();
		}
		*/
		
		//Selecting all the check boxes
		
		for(int i=0; i<count.size(); i++)
		{
			if(count.get(i).isSelected())			
			{
				count.get(i).click();
			}
			else
			{
				count.get(i).click();
			}
		}
		
		Thread.sleep(5000);
		
		for(WebElement chkbox:count)
		{
			if(chkbox.isSelected())
			{
				chkbox.click();
			}
			
			else
			{
				chkbox.click();
			}
		}
	}

}
