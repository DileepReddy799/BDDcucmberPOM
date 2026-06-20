package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("https://adactinhotelapp.com/");
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
     Thread.sleep(1000);
     driver.findElement(By.id("username")).sendKeys("reyaz0806");
     Thread.sleep(1000);
     driver.findElement(By.name("password")).sendKeys("reyaz123");
     Thread.sleep(1000);
     driver.findElement(By.id("login")).click();
     Thread.sleep(1000);
     driver.quit();
	}

}
