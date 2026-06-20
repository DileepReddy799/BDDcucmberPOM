package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizereactlocation {
//get size return type is Dimension
	//this will retrive the height and width
	//get height 
	//get widhth
//get react this method also it will give the height and widhth
//getlocation to getx() and gety() coordinates
	//this will retrevie the x and y coordinates
	//get tagname() it will get the tagname .....
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		System.out.println(driver.findElement(By.id("username")).getTagName());
	}

}
