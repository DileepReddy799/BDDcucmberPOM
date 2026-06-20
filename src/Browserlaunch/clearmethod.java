package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clearmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("7995910233");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name ='email']")).clear();
		 Thread.sleep(1000);
	driver.quit();
	}

	}

