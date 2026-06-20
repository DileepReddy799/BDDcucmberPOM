package Alllinkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinkstesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
  driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement link = driver.findElement(By.linkText("Forgot Password?"));
	//is that link is Displayed 
	System.out.println(link.isDisplayed());
	//to get the tagname of that link
	System.out.println(link.getTagName());
	//to get the text of that link
	System.out.println(link.getText());
	//to click that above link 
   link.click();
   System.out.println(driver.getCurrentUrl());
   System.out.println(driver.getTitle());
   driver.navigate().back();
   System.out.println(driver.getCurrentUrl());
   System.out.println(driver.getTitle());
   //to close that current window
   driver.quit();
	}
	
	

}
