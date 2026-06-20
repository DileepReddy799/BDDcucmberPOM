package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitvsclosemethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src=\"img/ios-button.png\"]")).click();
		Thread.sleep(1000);
		//driver.close();
		driver.quit();
	}

}
