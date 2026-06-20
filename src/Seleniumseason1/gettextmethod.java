package Seleniumseason1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextmethod {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();


		 

	}

}
