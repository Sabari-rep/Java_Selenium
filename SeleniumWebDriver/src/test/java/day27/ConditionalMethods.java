package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		// https://demo.nopcommerce.com/register
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//isDisplayed()
		boolean textstatus=driver.findElement(By.xpath("//*[@class='page-title']/child::h1")).isDisplayed();
		System.out.println("Display Status: " +textstatus );
		
		String text= driver.findElement(By.xpath("//*[@class='page-title']/child::h1")).getText();
		System.out.println(text);
		
		//isEnabled()
		boolean enablestatus=driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).isEnabled();
		System.out.println("Enable Status: " + enablestatus);
		
		//isSelected()
		WebElement male_rd=driver.findElement(By.cssSelector("input#gender-male"));
		WebElement female_rd=driver.findElement(By.id("gender-female"));
		
		System.out.println("Before Selecting");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		System.out.println("After Selecting");
		female_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		WebElement newletter=driver.findElement(By.name("Newsletter"));
		System.out.println("Is Newsletter box is selected: " + newletter.isSelected());
	}

}
