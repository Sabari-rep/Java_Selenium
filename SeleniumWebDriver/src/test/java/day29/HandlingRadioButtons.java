package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) {
		// https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement male_rd=driver.findElement(By.cssSelector("input#male"));
		WebElement female_rd=driver.findElement(By.id("female"));
		
		System.out.println("Before Selecting.............");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		male_rd.click();
		
		System.out.println("After Selecting.............");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		
	}

}
