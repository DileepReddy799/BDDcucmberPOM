package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverismethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.kvb.bank.in/");
   driver.manage().window().maximize();
   Thread.sleep(1000);
   //isdisplayed it will dispaly true if its displayed 
   //isenabled 
   //isselected 
   System.out.println(driver.findElement(By.xpath("//span[text()='Login']")).isDisplayed());
   driver.quit();
   
	}

}
