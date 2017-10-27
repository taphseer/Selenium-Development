package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.*;

public class OpenIE {


     public static void main(String[] args) throws InterruptedException {

         System.setProperty("webdriver.ie.driver","D:\\Team Jango\\SeleniumWorkspace\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");

         WebDriver browser = new InternetExplorerDriver();
        // Go to Bungo Base
         browser.get("http://10.2.64.3:9080/Jasper/");
         
         Thread.sleep(3000);
         browser.quit();
  }
    }