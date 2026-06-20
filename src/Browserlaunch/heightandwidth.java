package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class heightandwidth {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		 WebElement  heightwidth = driver.findElement(By.xpath("//input[@name ='email']"));
		int height =  heightwidth.getSize().getHeight();
		int width = heightwidth.getSize().getWidth();
		System.out.println("height"+ height );
		System.out.println("Width"+ width );
	driver.quit();
	}

	}

