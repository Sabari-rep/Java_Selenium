package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		
		// https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get(" https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//Min Slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Default location is: " + min_slider.getLocation());
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location after moving the slider is: " + min_slider.getLocation());

		
		//Max Slider
		WebElement max_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Default location is: " + max_slider.getLocation());
		act.dragAndDropBy(max_slider, -100, 250).perform();
		System.out.println("Location after moving the slider is: " + max_slider.getLocation());
		
	}

}
