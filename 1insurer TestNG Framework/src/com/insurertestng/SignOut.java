package com.insurertestng;

import org.testng.annotations.AfterTest;

public class SignOut extends SignIn {
	
	//ObjectRepository ipof = new ObjectRepository(driver);	
	 @AfterTest
	 public void iSignOut() {
		
		System.out.println("Signing out from the Application"); 
		ipof.iSignOut().click();
		//driver.findElement(By.linkText("(Sign out)")).click();
		System.out.println("Closing off the Chrome Browser"); 
		driver.close();
    }
	

}
