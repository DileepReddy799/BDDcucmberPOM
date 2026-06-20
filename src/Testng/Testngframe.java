package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngframe {
   
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	@Test
	public void browseractions()
	{
		
	}
	@AfterMethod
	public void teardown()
	{
		
	}
}
