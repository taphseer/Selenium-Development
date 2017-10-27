package m2Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

public class SignIn {
	
	//public String baseUrl = "http://10.2.64.12:9080/Jasper/";
    String Chromedriverpath = "C:\\chromedriver.exe";  
    public static WebDriver driver; 
	
	@BeforeSuite
	
	 public void iSignIn() throws IOException {
		System.out.println("Launching Chrome Browser");                             	                                
		Properties idataKey = new Properties ();
		FileInputStream kValue = new FileInputStream("D:\\1Lab\\Selenium Development\\1insurer TestNG Framework\\src\\com\\insurertestng\\DataFile.properties");
		idataKey.load(kValue);
		if (idataKey.getProperty("Browser").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Chromedriverpath);
			driver = new ChromeDriver();
			
		}
		
		else if (idataKey.getProperty("Browser").equals("Firefox"))
		
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else
		{
			System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		System.out.println("Signing into the Application");  
		driver.get(idataKey.getProperty("URL"));
	    driver.findElement(By.id("username")).sendKeys(idataKey.getProperty("UserName"));
		driver.findElement(By.id("password")).sendKeys(idataKey.getProperty("Password"));
		driver.findElement(By.name("Login")).click();
	    driver.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[1]/button")).click(); //Restore all
		//driver.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[2]/button")).click(); //Clear all
		driver.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[3]/button")).click(); //Apply
	    }
	
//	public static WebDriver getDriver() {
//		return driver;
//	}

}
