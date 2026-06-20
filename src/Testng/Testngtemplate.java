package Testng;

import org.testng.annotations.Test;

public class Testngtemplate
{

	
	@Test(priority =1)
	public void login1()
	{
		System.out.println("login into Flipkart");
       System.out.println("Enter a number ");
       System.out.println("try to register");
       System.out.println("logout Amazon");

	}
	@Test
	public void login()
	{
		System.out.println("login into Amazon");
       System.out.println("Enter a number ");
       System.out.println("try to register");
       System.out.println("logout Amazon");

	}
	
	

}
