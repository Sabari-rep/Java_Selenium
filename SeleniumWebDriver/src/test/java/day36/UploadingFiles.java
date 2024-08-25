package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFiles {

	public static void main(String[] args) {

		// https://davidwalsh.name/demo/multiple-file-upload.php

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

		/*
		 * //Single file Upload driver.findElement(By.id("filesToUpload")).
		 * sendKeys("C:\\Users\\Dell\\OneDrive\\Desktop\\Test Files\\Test1.txt");
		 * if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals(
		 * "Test1.txt")) { System.out.println("File uploaded"); } else {
		 * System.out.println("File uploaded failed"); }
		 */

		// Multiple File Uploading
		String file1 = "C:\\Users\\Dell\\OneDrive\\Desktop\\Test Files\\Test1.txt";
		String file2 = "C:\\Users\\Dell\\OneDrive\\Desktop\\Test Files\\Test2.txt";

		driver.findElement(By.id("filesToUpload")).sendKeys(file1 + "\n" + file2);

		// File Numbers validation
		int filecount = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if (filecount == 2) {
			System.out.println("All the files are uploaded");
		} else {
			System.out.println("Files not uploaded properly");
		}

		// File Name validation
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt"))

		{
			System.out.println("Files uploaded..");
		} else {
			System.out.println("Files not uploaded");
		}

	}

}
