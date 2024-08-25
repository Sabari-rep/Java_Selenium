package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		// https://www.jquery-az.com/boots/demo.php?ex=63.0_2
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@class,'multiselect')]")).click();
		
		Thread.sleep(4000);
		
		//Selecting Single Element in dropdown
		
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		
		//Capture all the options from dropdown
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("The options count on dropdown is: " + options.size());
		
		//Printing all the options from dropdown in console
		/*
		for(int i=0; i<=options.size()-1; i++)
		{
			System.out.println(options.get(i).getText());
		}
		*/
		
		//Selecting Multiple options from the dropdown
		
		for(int i=0; i<options.size(); i++)
		{
			WebElement option=options.get(i);
			String op = option.getText();
			
			if(op.equals("Java") || op.equals("Python") || op.equals("Oracle"))
			{
			option.click();
			}
		}
	}

}
