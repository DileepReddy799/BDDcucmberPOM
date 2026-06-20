package Alllinkstesting;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowntesting1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.amazon.in/");
 	driver.manage().window().maximize();
 	//using select by index class
 //WebElement  drop =	driver.findElement(By.xpath("searchDropdownBox"));
 //Select s1= new Select(drop);
 //s1.selectByIndex(11);
 Thread.sleep(1000);
    driver.quit();
	}

}
