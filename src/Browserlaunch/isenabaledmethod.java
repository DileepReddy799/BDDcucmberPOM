package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabaledmethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.xpath("//button[text()='Click Me!']")).isEnabled());
		
		driver.quit();
	}
	
	

}
