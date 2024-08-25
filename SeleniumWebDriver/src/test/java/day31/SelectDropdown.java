package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		// https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropCountryElement=driver.findElement(By.xpath("//*[@id='country']"));
		Select dropCountry = new Select(dropCountryElement);
		
		//Select the required options from Dropdown
		
		//dropCountry.selectByVisibleText("India");
		//dropCountry.selectByValue("uk");
		dropCountry.selectByIndex(9);
		
		//Capturing the options from dropdown
		
		List<WebElement>count = dropCountry.getOptions();
		System.out.println("The number of options in the dropdown is: " + count.size());
		
		//Printing all the options in console
		
		for(int i=0; i<count.size(); i++)
		{
			System.out.println(count.get(i).getText());
		}
		
		
	}

}
