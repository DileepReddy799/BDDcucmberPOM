package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addingproductintocart 

{
 WebDriver driver;
 @BeforeClass
 public void setup() throws InterruptedException
 {
	  driver =new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
 }
 @Test
 public void  addingprouct()
 {
	 
	 
 }
 @AfterMethod
 public void teardown()
 {
	 
 }
}
