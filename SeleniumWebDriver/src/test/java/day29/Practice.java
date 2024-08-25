package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
	
		//https://practice.expandtesting.com/checkboxes
		
		//Check boxes
		/*
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement chk_box1=driver.findElement(By.cssSelector("input#checkbox1"));
		WebElement chk_box2=driver.findElement(By.cssSelector("input#checkbox2"));
		
		System.out.println(chk_box1.isSelected());
		System.out.println(chk_box2.isSelected());
		
		chk_box2.click();
		
		System.out.println(chk_box1.isSelected());
		System.out.println(chk_box2.isSelected());
		*/
		
		//Radio Buttons
		
		//https://practice.expandtesting.com/radio-buttons
		

		WebDriver driver = new ChromeDriver();
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));    //Explicit Wait Declaration
		
		
		driver.get("https://practice.expandtesting.com/radio-buttons");
		driver.manage().window().maximize();
		
		//Explicit Wait Usage
		
		WebElement green = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='green'and @value='green']")));
		
		System.out.println("Status of blue check box is? " + green.isSelected());
		
		green.click();
		
		System.out.println("Status of blue check box is? " + green.isSelected());
		
		System.out.println("Sport Selecting");
		WebElement football = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='football']")));
		System.out.println("Is sport button is selected? " + football.isSelected());
		
		football.click();
		
		System.out.println("Is sport button is selected? " + football.isSelected());
	
		

		

	}

}
