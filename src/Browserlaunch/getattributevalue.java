package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattributevalue {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).click();
		System.out.println(driver.findElement(By.id("username_span")).getText());
		//it will get the text from <> between 
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("class"));
		//it will get the attrribute value
    System.out.println(driver.findElement(By.linkText("Forgot Password?")).getAttribute("href"));  
    //it will get the attrribute value 
    System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));
    //it will get the colour value 
    System.out.println(driver.findElement(By.id("username_span")).getCssValue("font-size"));
    //it will get the font size
    //it will retrive the colour size and font size
    
    driver.quit();

	}

}
