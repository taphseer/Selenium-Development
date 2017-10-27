package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByXPath{
	  public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "D:\\Team Jango\\SeleniumWorkspace\\geckodriver-v0.18.0-win64/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.com");
	    WebElement searchButton =  driver.findElement(By.xpath("//*[@id='tsf']"));
	    System.out.println(searchButton.getText());
	  }
	 }