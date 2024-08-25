package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		//https://www.amazon.in/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Xpath with single attributes
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shirts");
		
		//Xpath with multiple attributes
		//driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'][@placeholder='Search Amazon.in']")).sendKeys("Laptop");
		
		
		//Xpath with 'and' & 'or' Operators
		//driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' and @placeholder='Search Amazon.in']")).sendKeys("Laptop");
		//driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' or @placeholder='sabari']")).sendKeys("Laptop");
		
		/*
		//Xpath with text() method -- Inner Text
		driver.findElement(By.xpath("//*[text()='Customer Service']")).click();
		
		boolean text_display=driver.findElement(By.xpath("//*[text()='Get to Know Us']")).isDisplayed();
		System.out.println(text_display);
		
		String text=driver.findElement(By.xpath("//*[text()='Get to Know Us']")).getText();
		System.out.println(text);
		*/
		
		
		//Xpath with contains() method
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Desktops");
		
		
		//Xpath with starts-with() method
		//driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]")).sendKeys("Desktops");
		
		//Chained Xpath
		
		driver.findElement(By.xpath("//*[@id='nav-logo']/a")).click();
		

	}

}
