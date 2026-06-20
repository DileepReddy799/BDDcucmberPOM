package Seleniumseason1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextmethod1 {

	public static void main(String[] args) throws InterruptedException {
		{
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://adactinhotelapp.com/");
			 driver.manage().window().maximize();
			 System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());			
	        driver.findElement(By.id("login")).click(); 
	        Thread.sleep(1000);
	        System.out.println(driver.findElement(By.id("username_span")).getText());
	        System.out.println(driver.findElement(By.id("username")).getAttribute("class"));
   driver.quit();
	}

}
}
