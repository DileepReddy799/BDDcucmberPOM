package Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edgebrowserlaunch {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://www.cricbuzz.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.quit();
	}

}

