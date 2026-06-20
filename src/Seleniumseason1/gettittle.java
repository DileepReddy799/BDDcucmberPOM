package Seleniumseason1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettittle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver  driver = new ChromeDriver();
    driver.get("https://www.latitudefinancial.com.au/");
    Thread.sleep(1000);
    driver.manage().window().maximize();
   String tittle =  driver.getTitle();
   Thread.sleep(1000);
   System.out.println(tittle);
   System.out.println(driver.getCurrentUrl());
   Thread.sleep(1000);
    driver.quit();
   
	}

}
