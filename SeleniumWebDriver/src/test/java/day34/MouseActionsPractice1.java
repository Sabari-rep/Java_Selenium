package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsPractice1 {

	public static void main(String[] args) {
		
		// https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Double click action
		
		WebElement box1=driver.findElement(By.id("field1"));
		WebElement box2=driver.findElement(By.id("field2"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		String text=box2.getAttribute("value");
		System.out.println(text);
		
		if(text.equals("Hello World!"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//Drag And Drop Action
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions act1 = new Actions(driver);
		
		act1.dragAndDrop(draggable, droppable).perform();
		String boxtext=droppable.getText();
		System.out.println("The box contains the text of: " + boxtext);

	}

}
