package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// https://ui.vision/demo/webtest/frames/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1
		WebElement frame1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		
		//Frame2
		WebElement frame2 = driver.findElement(By.xpath("//*[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("Automation");
		
		driver.switchTo().defaultContent();
		
		
		//Frame3
		WebElement frame3 = driver.findElement(By.xpath("//*[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("Programming");
		
		//switchTo() to inner frame(part of the frame3)
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='i8']//*[@class='AB7Lab Id5V1']")).click();
		
		driver.switchTo().defaultContent();
		
		
		//Frame4
		WebElement frame4 = driver.findElement(By.xpath("//*[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.name("mytext4")).sendKeys("Sabari");
		
		
		driver.switchTo().defaultContent();
		
		//Frame5
     	WebElement frame5 = driver.findElement(By.xpath("//*[@src='frame_5.html']"));
     	driver.switchTo().frame(frame5);
     	driver.findElement(By.xpath("//*[@name='mytext5']")).sendKeys("Thankyou");
     	driver.findElement(By.xpath("//*[@href='https://a9t9.com']")).click();
     	
     	driver.switchTo().frame(1);
     	driver.findElement(By.xpath("//*[@id='logo']")).isDisplayed();
     	
     	
     	
     	
	}

}
