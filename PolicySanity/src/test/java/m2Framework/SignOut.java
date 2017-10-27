package m2Framework;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class SignOut extends SignIn {
	
	 @AfterTest
	 public void iSignOut() {
		
		System.out.println("Signing out from the Application");  
		driver.findElement(By.linkText("(Sign out)")).click();
		System.out.println("Closing off the Chrome Browser"); 
		driver.close();
    }
	

}
