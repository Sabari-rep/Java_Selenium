package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorDemo {

	public static void main(String[] args) {
		// https://demo.nopcommerce.com/
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();      //--------> Used to maximize the opened window automatically	
		//driver.manage().window().minimize();      //--------> Used to minimize the opened window automatically
		
		//1.tag id              -----> tag#id

		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Shirts");
		
		//2.tag class           -----> tag.classname
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Shirts");
		
		//3.tag attribute       -----> tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Shirts");
		
		//4.tag class attribute -----> tag.classname[attribute='value']
		
		//driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("Shirts");
		//driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Shirts");
		
		
		//Practice
		//https://demo.opencart.com/
		//Find the elements using all CSS locators
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("MacBook");
		
		
	
		
		
	}

}
