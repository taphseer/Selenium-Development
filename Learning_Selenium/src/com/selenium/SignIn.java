package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.utility.ExcelUtils;


public class SignIn {
	   public static void main(String[] args) throws Exception{
		 System.setProperty("webdriver.gecko.driver", "D:\\Team Jango\\SeleniumWorkspace\\geckodriver-v0.18.0-win64/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
	     driver.get("http://10.67.24.101:9080/Jasper/");
	     // They are the findElement() method, By.name() method, and the WebElement interface. The findElement() and By() methods instruct 
	     // WebDriver to locate a WebElement on a web page, and once found, the findElement() method returns the WebElement instance of 
	     // that element. Actions such as click, type, and so on, are performed on a returned WebElement using the methods declared in 
	     // the WebElement interface.
	     

		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

		String Username = ExcelUtils.getCellData(2, 4);

		String Password = ExcelUtils.getCellData(2, 5);
	     
	     WebElement username = driver.findElement(By.name("username"));
	     username.sendKeys(Username);
	     WebElement password = driver.findElement(By.name("password"));
	     password.sendKeys(Password);
	     WebElement login = driver.findElement(By.name("Login"));
	     login.click();
	     
	     WebElement logout = driver.findElement(By.linkText("(Sign out)"));
	     logout.click();
	     driver.quit();
	   }
	}