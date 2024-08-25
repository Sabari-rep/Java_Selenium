package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		// https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement countryElement=driver.findElement(By.xpath("//select[@name='country']"));
		countryElement.click();
		driver.findElement(By.xpath("//*[text()='France']")).click();
		
		
		/*
		Select countryOptions = new Select(countryElement);
		
		countryOptions.selectByVisibleText("India");
		List<WebElement> count = countryOptions.getOptions();
		System.out.println("Count is: " + count.size());
		
		for(int i=0; i<count.size(); i++)
		{
			System.out.println(count.get(i).getText());
		}
		*/
		
		//https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement colors = driver.findElement(By.id("colors"));
		colors.click();
		Thread.sleep(3000);
		
		Select multicolor = new Select(colors);
		multicolor.selectByVisibleText("Red");
		
		List<WebElement>multicolors = multicolor.getOptions();
		System.out.println("Colors count is: " + multicolors.size());
		
		for(int i=0; i<multicolors.size(); i++)
		{
			WebElement color = multicolors.get(i);
			String name = color.getText();
			
			if(name.equals("Red") || name.equals("Green") || name.equals("Yellow"))
			{
				color.click();
			}
		}
		
		
		
	
		

		
		
				
		

	}

}
