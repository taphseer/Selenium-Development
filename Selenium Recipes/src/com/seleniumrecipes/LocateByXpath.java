package com.seleniumrecipes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		//Locating element by text
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
        // Locating element by sibling when parent is dynamic
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
       // Traverse back -getting parent node name
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));	
		
	}

}
