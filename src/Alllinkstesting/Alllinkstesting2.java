package Alllinkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinkstesting2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
  driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement Registerlink = driver.findElement(By.linkText("New User Register Here"));
	System.out.println(Registerlink.getAttribute("href"));
	System.out.println(driver.getCurrentUrl());
	System.out.println(Registerlink.getText());
	//to get the tagename of the attribute
	System.out.println(Registerlink.getTagName());
	//to get the register link is Displayed
	System.out.println(Registerlink.isDisplayed());
	Registerlink.click();
	//to get the current page url
	System.out.println(driver.getCurrentUrl());
	
   driver.quit();
	}
}
