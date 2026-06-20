package Browserlaunch;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tittlevalidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String tittle = driver.getTitle();
		System.out.println(driver.getTitle());
		if(tittle.equals("Amazon.in"))
		{
			System.out.println("Passed : test passed");
		}
		else
		{
			System.out.println("Failed : test failed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(url.contains("www.amazon.in"))
		{
			System.out.println("Passed : url has Amazon.in");
		}
		else
		{
			System.out.println("failed : url donthave Amazon.in");
		}
	}
}
