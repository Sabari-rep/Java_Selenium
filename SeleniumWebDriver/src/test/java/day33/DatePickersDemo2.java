package day33;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickersDemo2 {

	// User defined method for converting month from String to month object

	static Month convertMonth(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();

		monthMap.put("January", Month.JANUARY);
		monthMap.put("Febryary", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);

		Month vmonth = monthMap.get(month);

		if (vmonth == null) {
			System.out.println("Invlid month");
		}

		return vmonth;

	}

	static void findrequiredDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate) {

		// Selecting the year
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year = new Select(YearDropdown);
		year.selectByVisibleText(requiredYear);

		// Select month

		while (true) {
			String displaymonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			// Converting displaymonth & requiredmonth from string to object
			Month expectedmonth = convertMonth(requiredMonth);
			Month currentmonth = convertMonth(displaymonth);

			// Comparing
			int result = expectedmonth.compareTo(currentmonth);

			if (result > 0) {
				// Future
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			} else if (result < 0) {
				// Past
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			} else {
				break;

			}

		}

		// Select date
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : dates) {
			if (dt.getText().equals(requiredDate)) {
				dt.click();
				break;

			}
		}

	}

	public static void main(String[] args) {

		// https://testautomationpractice.blogspot.com/

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Required date to finds
		String requiredYear = "1999";
		String requiredMonth = "September";
		String requiredDate = "5";

		// Switch to frame
		driver.switchTo().frame("frame-one796456169");

		// Finding the calender
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		findrequiredDate(driver,requiredYear,requiredMonth,requiredDate);

	}
}
