package Alllinkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectmethods {

	public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // Click on Create New Account
        driver.findElement(By.linkText("Create new account")).click();

        // Wait for signup popup
        Thread.sleep(3000);

        // Enter First Name
        driver.findElement(By.name("firstname")).sendKeys("Dileep");

        // Select Day
        WebElement day = driver.findElement(By.id("day"));
        Select daySelect = new Select(day);
        daySelect.selectByVisibleText("15");

        // Select Month
        WebElement month = driver.findElement(By.id("month"));
        Select monthSelect = new Select(month);
        monthSelect.selectByVisibleText("Jun");

        // Select Year
        WebElement year = driver.findElement(By.id("year"));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("1997");

        System.out.println("First Name and DOB entered successfully.");

        // Close browser
        // driver.quit(); 		
	} 

}
