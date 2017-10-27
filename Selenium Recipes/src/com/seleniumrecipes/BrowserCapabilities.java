package com.seleniumrecipes;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		// Setting your Chrome options (Desired capabilities)
		ChromeOptions options = new ChromeOptions();
		options.addArguments();
		options.addArguments();

		// Creating a driver instance with the previous capabilities
		WebDriver driver = new ChromeDriver(options);

		// Load page & take screenshot of full-screen page
		driver.get("http://google.com");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		scrFile.getAbsolutePath();

	}

}