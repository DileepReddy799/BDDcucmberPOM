package Seleniumseason1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());			
		 Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		System.err.println(driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com/");
   System.out.println(driver.getTitle());
   Thread.sleep(1000);
   driver.quit();	 
	}

}
