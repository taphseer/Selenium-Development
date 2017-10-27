package com.seleniumrecipes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Team Jango\\SeleniumWorkspace\\geckodriver-v0.18.0-win64/geckodriver.exe");

		WebDriver browser = new FirefoxDriver(); // 'browser' object will use the FirefoxDriver Class to implement the methods present in the WebDriver interface
		browser.get("http://10.2.64.12:9080/Jasper/");
		browser.findElement(By.id("username")).sendKeys("haiderm");
		browser.findElement(By.id("password")).sendKeys("haiderm");
		browser.findElement(By.name("Login")).click();
		browser.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[1]/button")).click(); //Restore all
		browser.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[3]/button")).click(); //Apply
		
		
		WebElement PolicyClientSearch = browser.findElement(By.linkText("Policy client search"));
		PolicyClientSearch.click();
		WebElement SignOut = browser.findElement(By.linkText("(Sing Out)"));
		SignOut.click();
	}
	}

