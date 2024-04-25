package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Baseclass {
	public WebDriver driver;
	public ExtentSparkReporter sparkReporter;
	public ExtentReports report;
	public ExtentTest test;

	
	
	@BeforeSuite
	public void connection() throws Throwable
	{
		Reporter.log("The connection started",true);
		
	}
	
	@BeforeClass
	public void browsersetup(@Optional("Chrome") String browsername)
	{
		if(browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browsername.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equals("Fireefox")) {
			driver=new FirefoxDriver();
		}
		else
		{
			Reporter.log("Browser is invalid");
		}
	}
	
	@BeforeMethod
	public void meth()
	{
		Reporter.log("The method part",true);
	}
	
	@BeforeTest
	public void url() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Readthedata redd =new Readthedata();
		redd.Readtd();
		
	}
	@AfterSuite
	public void close(WebDriver driver)
	{
		driver.close();
	}
	
	

}
