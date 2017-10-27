package com.insurertestng;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import com.PageObjectRepository.ObjectRepository;

public class SignIn {

	public static String Chromedriverpath = "C:\\chromedriver.exe";
	public static Properties idataKey;
	public static FileInputStream kValue;
	public static WebDriver driver;
	//public static RemoteWebDriver driver;
	public static ObjectRepository ipof;
	

	static {
		idataKey = new Properties();
		idataKey();
		
		if (idataKey.getProperty("Browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", Chromedriverpath);
			driver = new ChromeDriver();

		}

		else if (idataKey.getProperty("Browser").equals("Firefox"))

		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			//capabilities.setCapability(FirefoxDriver.BINARY, new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
				
					
		} else {
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		// Selenium Grid
//		DesiredCapabilities capabilities =DesiredCapabilities.firefox();
//		capabilities.setBrowserName("firefox");
//		capabilities.setPlatform(Platform.VISTA);
//		capabilities.setCapability(FirefoxDriver.BINARY, new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
//		try {
//			driver = new RemoteWebDriver(new URL(idataKey.getProperty("VMNode_Tafseer")), capabilities);
//		} catch (MalformedURLException e) {
//			
//			e.printStackTrace();
//		}	
		ipof = new ObjectRepository(driver);
		

	}

	public static void idataKey() {
		try {
			  kValue = new FileInputStream("D:\\1Lab\\Selenium Development\\1insurer TestNG Framework\\src\\com\\insurertestng\\DataFile.properties");
			  idataKey.load(kValue);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@BeforeSuite

	public void iSignIn() throws IOException {
		System.out.println("Launching Your Desired Browser");  
		
		driver.get(idataKey.getProperty("iURL"));
		ipof.UserName();
		ipof.Password();
		ipof.Login();
		ipof.RestoreAll().click();
		ipof.Apply().click();
		// driver.findElement(By.id("username")).sendKeys(idataKey.getProperty("UserName"));
		// driver.findElement(By.id("password")).sendKeys(idataKey.getProperty("Password"));
		// driver.findElement(By.name("Login")).click();
		// driver.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[1]/button")).click();
		// //Restore all
		// driver.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[2]/button")).click();
		// //Clear all
		// driver.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[3]/button")).click();
		// //Apply
	}

	// public static WebDriver getDriver() {
	// return driver;
	// }
	
}
