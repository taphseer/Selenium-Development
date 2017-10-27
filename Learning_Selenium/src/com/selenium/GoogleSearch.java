package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSearch {
	   public static void main(String[] args){
		 System.setProperty("webdriver.gecko.driver", "D:\\Team Jango\\SeleniumWorkspace\\geckodriver-v0.18.0-win64/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
	     driver.get("http://www.google.com");
	     // They are the findElement() method, By.name() method, and the WebElement interface. The findElement() and By() methods instruct 
	     // WebDriver to locate a WebElement on a web page, and once found, the findElement() method returns the WebElement instance of 
	     // that element. Actions such as click, type, and so on, are performed on a returned WebElement using the methods declared in 
	     // the WebElement interface.
	     
	     WebElement searchBox = driver.findElement(By.name("q"));
	     searchBox.sendKeys("Packt Publishing");
	     searchBox.submit();
	   }
	}