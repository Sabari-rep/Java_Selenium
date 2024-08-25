package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVSAction {

	public static void main(String[] args) throws InterruptedException {
		
		//https://swisnl.github.io/jQuery-contextMenu/demo.html  -------> Right click action
		
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				driver.manage().window().maximize();
				
				WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
				
				//Actions -----> Class, Will be used to perform the mouse actions
				//Action ------> Interface, will be used to store the created actions
				
				Actions act = new Actions(driver);
				Action myaction = act.contextClick(button).build();
				myaction.perform();
				
				
				//Click copy
				driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
				
				Thread.sleep(4000);
				//Closing an alert box
				driver.switchTo().alert().accept();
				
			}
	}


