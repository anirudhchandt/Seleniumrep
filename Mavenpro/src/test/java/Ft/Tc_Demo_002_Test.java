package Ft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_Demo_002_Test {
	
	@Test
	public void Run()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	}

}
