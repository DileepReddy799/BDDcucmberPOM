package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ismethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://echoecho.com/htmlforms10.htm#google_vignette");
      System.out.println(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
      System.out.println(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
      System.out.println(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
      System.out.println(driver.findElement(By.xpath("//input[@value='Water']")).isSelected());
      System.out.println(driver.findElement(By.xpath("//input[@value='Beer']")).isSelected());
      System.out.println(driver.findElement(By.xpath("//input[@value='Wine']")).isSelected());
	}

}
