package Alllinkstesting;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbyvisibletext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		 	driver.manage().window().maximize();
		 	
		 	new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		 	Thread.sleep(1000);
		 	driver.quit();
	}

}
