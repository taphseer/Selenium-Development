package com.insurertestng;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class AddIndividualClient extends SignIn {

	private static Logger iLogs = LogManager.getLogger(AddIndividualClient.class.getName());
	//ObjectRepository ipof = new ObjectRepository(driver);	
	@BeforeTest
	public void ChangeBrand() throws InterruptedException {
	//Change Brand
	System.out.println("Changing Environment Brand");  
	ipof.iBrand().click();
	//driver.findElement(By.linkText("Change brand")).click();
	Thread.sleep(3000);
	Select ChangeBrand = new Select(ipof.iBDropdown());
	//Select ChangeBrand = new Select(driver.findElement(By.cssSelector("#userBrandCombo")));
	ChangeBrand.selectByVisibleText("Model Office UK");
	ipof.iBSave().click();
	//driver.findElement(By.cssSelector("#changeUserBrandSave")).click();
	Thread.sleep(6000);
	}
	
		
	@Test
	public void iSearchClient() {
		
		// Search functionality
		ipof.iSearch().click();
		//driver.findElement(By.linkText("Search")).click();
		ipof.iPolicyClientSearch().click();
		//driver.findElement(By.linkText("Policy client search")).click();
		System.out.println("Searching for the Client"); 
	}
	
	@Test(dependsOnMethods = {"iSearchClient"})
	public void iAddindividualClient() throws InterruptedException {
		
		ipof.dummyFirstName().sendKeys("abc");
		//driver.findElement(By.id("SC_ClientSearch_LastName")).sendKeys("abc");
		ipof.dummyLastName().sendKeys("abc");
		//driver.findElement(By.id("SC_ClientSearch_FirstName")).sendKeys("abc");
		ipof.dummyPostCode().sendKeys("S016 9AA");
		//driver.findElement(By.id("SC_ClientSearch_PostCode")).sendKeys("S016 9AA");
		
		//Click on Search button
		ipof.iSButton().click();
		//driver.findElement(By.xpath("//*[@id='container']/div[3]/table/tbody/tr/td/div[1]/button")).click();
		//System.out.println("Client Not Found"); 
		iLogs.info("Client Not Found");
		//Create Individual Client
		//WebElement AddIndividual = driver.findElement(By.cssSelector("#btnAddIndividualClient"));
		//System.out.println(AddIndividual.isEnabled());
		Thread.sleep(5000);
		//System.out.println(AddIndividual.isEnabled());
		ipof.AiButton().click();
		//driver.findElement(By.cssSelector("#btnAddIndividualClient")).click();
		Thread.sleep(5000);
		// Complete All Mandatory fields
		//Title
		System.out.println("Creating New Individual Client"); 
		Select Title = new Select(ipof.iTitle());
		//Select Title = new Select(driver.findElement(By.id("ClientAdd_NameTitle_1a")));
		Title.selectByVisibleText("Dr");
		
		// Randomly Enter First & Last Names
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		ipof.iFirstName().clear();
		//driver.findElement(By.cssSelector("#ClientAdd_FirstNm_1a")).clear();
		ipof.iFirstName().sendKeys(firstName);
		//driver.findElement(By.cssSelector("#ClientAdd_FirstNm_1a")).sendKeys(firstName);
		ipof.iLastName().clear();
		//driver.findElement(By.cssSelector("#ClientAdd_LastNm_1a")).clear();
		ipof.iLastName().sendKeys(lastName);
		//driver.findElement(By.cssSelector("#ClientAdd_LastNm_1a")).sendKeys(lastName);
		//Enter E-mail Address
		ipof.iEmail().sendKeys("tafseer.haider@ei.1insurer.com");
		//driver.findElement(By.id("ClientAdd_OfficeEmail_1a")).sendKeys("tafseer.haider@ei.1insurer.com");
		//QAS - Quick Address Search
		ipof.iPostCode().sendKeys("BL6 7AU");
		//driver.findElement(By.id("SC_Search_Criteria")).sendKeys("BL6 7AU");
		Thread.sleep(5000);
		ipof.QasButton().click();
		//driver.findElement(By.cssSelector("#searchLocationIcon")).click();
		//Select Address
		Select QAS = new Select(ipof.QasResults());
		//Select QAS = new Select(driver.findElement(By.cssSelector("#SC_Search_Results")));
		Thread.sleep(5000);
		QAS.selectByIndex(1);
		//QAS.selectByVisibleText("Victoria Sandwich, 67 Lee Lane, Horwich, BOLTON BL6 7AU");
		Thread.sleep(3000);
		// Enter Date of Birth
		ipof.iDOB().click();
		//driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_DOB")).click();
		ipof.iDOB().sendKeys("05/05/1988");
		//driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_DOB")).sendKeys("05/05/1988");
		// Select Gender
		Select Gender = new Select(ipof.iGender());
		//Select Gender = new Select(driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_Gender")));
		Gender.selectByVisibleText("Male");
		
		//Select Marital Status
		Select MStatus = new Select(ipof.iMaritalStatus());
		//Select MStatus = new Select(driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_MaritalStatus")));
		MStatus.selectByVisibleText("Single");
		
		//Select Occupation Details
		Select Occupation = new Select(ipof.iOccupation());
		//Select Occupation = new Select(driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_Occupation")));
		Thread.sleep(8000);
		Occupation.selectByIndex(2);
		
		Select OccuBusType = new Select(ipof.iBusType());
		//Select OccuBusType = new Select(driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_Occupation_Business_Type")));
		Thread.sleep(8000);
		OccuBusType.selectByIndex(2);
		
		Select SecEmp = new Select(ipof.iSecOccu());
		//Select SecEmp = new Select(driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_Secondary_Occupation")));
		Thread.sleep(8000);
		SecEmp.selectByIndex(2);
		
		Select SecEmpBusType = new Select(ipof.iSecBusType());
		//Select SecEmpBusType = new Select(driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_Secondary_Occupation_Business_Type")));
		Thread.sleep(8000);
		SecEmpBusType.selectByIndex(2);
		
		Select Lang = new Select(ipof.iLanguage());
		//Select Lang = new Select(driver.findElement(By.cssSelector("#SC_ClientDetailsMaintain_Language")));
		Thread.sleep(3000);
		Lang.selectByVisibleText("English (UK)");
		Thread.sleep(2000);
		// Proceed
		ipof.iForward().click();
		//driver.findElement(By.cssSelector(".igFlowNext")).click();
		iLogs.info("Houshold info Message Received");	
		//Handle Pop-ups
		try {List<WebElement> AddToHousehold = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#igUserInteractResponseYes")));
	    if (!AddToHousehold.isEmpty())	{
	    	AddToHousehold.get(0).click();
	     }
		}
	    catch (TimeoutException e) {
	    	
	    	e.printStackTrace();
	    }
		
	   iLogs.info("Client is successfully created.");
	
	
}
}