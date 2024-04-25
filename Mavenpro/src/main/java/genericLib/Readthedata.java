package genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readthedata {
	WebDriver driver;
	public void Readtd() throws Throwable
	{
		File fil = new File("./demowork1.properties");	
		FileInputStream fis = new FileInputStream(fil);
		Properties pro = new Properties();
		pro.load(fis);
		String urll = pro.getProperty("url");
		System.out.println(urll);
	}

}
