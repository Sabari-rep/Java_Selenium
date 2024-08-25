package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//getText()  -----> If we have a inner text in html the "getText()" method will works to capture the value
//if inner text is not present in the html then use the "getAttribute(attribute)" method

public class DoubleClickAction {

	public static void main(String[] args) {
		
		// https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		
		WebElement box1= driver.findElement(By.id("field1"));
		WebElement box2=driver.findElement(By.id("field2"));
		WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("Welcome");
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		//Validation | box2 contains the "Welcome"
		
		String text = box2.getAttribute("value");
		System.out.println("The box2 text is: " + text);
		
		if(text.equals("Welcome"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		

	}

}
