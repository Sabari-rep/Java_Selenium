package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPracticeDemo {

	public static void main(String[] args) throws InterruptedException {
		// https://mypage.rediff.com/login/dologin
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();


	}

}
