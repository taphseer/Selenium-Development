package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //  References the WebDriver interface which is required to instantiate a new web browser.
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenFireFox {

       public static void main(String[] args)  throws InterruptedException {


    	 //if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
    	   System.setProperty("webdriver.gecko.driver", "D:\\Team Jango\\SeleniumWorkspace\\geckodriver-v0.18.0-win64/geckodriver.exe");

    			WebDriver browser = new FirefoxDriver(); // 'browser' object will use the FirefoxDriver Class to implement the methods present in the WebDriver interface
    			browser.get("http://10.2.64.12:9080/Jasper/");
    			browser.findElement(By.id("username")).sendKeys("haiderm");
    			browser.findElement(By.id("password")).sendKeys("haiderm");
    			browser.findElement(By.name("Login")).click();
    			browser.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[1]/button")).click(); //Restore all
    			browser.findElement(By.xpath("//div[@id='igLegend3']/div[4]/div[3]/button")).click(); //Apply
    			
    		}
    	}