package Alllinkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
  driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-17/06/2026&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&lang=eng&cmp=SEM|D|DF|B|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|RSA|");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.xpath("//button[@data-cy='submit' and contains(@class,'fswRevampedSearchButton')]\r\n"
			+ "")).isEnabled());
	driver.quit();
   
	}
	
	

}
