package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfteBeforemethod

{
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("browser started ");
		   System.out.println("App launched");
		
	}
   @Test
   public void login()
   {
	   System.out.println("launch Amazon Application");
	   System.out.println("click on login");
	   System.out.println("enter valid user name");
	   System.out.println("enter valid passowrd"); 
   }
   @Test(priority =1)
   public void registration()
   {
	   System.out.println("launch Flipkart Application");
	   System.out.println("click on login");
	   System.out.println("enter valid user name");
	   System.out.println("enter valid passowrd");
   }
   @AfterMethod
   public void teardown()
   {
	   System.out.println("Browser closed");
	   
   }
   
}
