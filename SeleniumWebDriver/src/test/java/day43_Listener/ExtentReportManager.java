package day43_Listener;

import org.testng.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkreporter;  //UI of the report
	public ExtentReports extent;               //Populate common information on the report
	public ExtentTest test;           //Creating test case entries in the reports and update the status of the test methods
	
	
	public void onStart(ITestContext context)
	{
		sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myReport.html");
		
		sparkreporter.config().setDocumentTitle("Automation Report");   //Used to name the the title of the report page
		sparkreporter.config().setReportName("Functional Testing");     //Used to name the the name of the report
		sparkreporter.config().setTheme(Theme.DARK);      //Used to select the theme of the report 
		
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		
		extent.setSystemInfo("Computer name","Local host");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester naem","Sabari");
		extent.setSystemInfo("OS","Windows 11");
		extent.setSystemInfo("Browser name","Chrome");
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName());   //Creating a new entry in the report
		test.log(Status.PASS, "Test case passed is: " + result.getName()); // update the test status whether pass/fail/skip
	}
	
	public void onTestFailure(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case failled is: " + result.getName());
		test.log(Status.FAIL, "Test case failed is: " + result.getThrowable());   //Update the error in the report
	}
	

	public void onTestSkipped(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Skipped is: " + result.getName());
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
}
