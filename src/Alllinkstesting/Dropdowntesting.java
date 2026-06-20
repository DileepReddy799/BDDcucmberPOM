package Alllinkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowntesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("searchDropdownBox")).sendKeys("Amazon Fresh");
	Thread.sleep(1000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("eggs");
	Thread.sleep(1000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
   driver.quit();
	}
}
