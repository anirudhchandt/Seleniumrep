package Ft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_Demo_001_Test {

	@Test
	public void Pro()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
}
