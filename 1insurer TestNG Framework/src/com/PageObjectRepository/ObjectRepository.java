package com.PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepository {
	
	WebDriver driver;
	
	// Constructor to make all the methods in this Repo to be accessible in our Test Cases
	public ObjectRepository (WebDriver driver)
	{
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	//Page Object Patterns
	// Sign In - Objects
	
	/*By Username = By.id("username");
	By Password = By.id("password");
	By Login = By.name("Login");	
	By RestoreAll = By.xpath("//div[@id='igLegend3']/div[4]/div[1]/button");
	By ClearAll = By.xpath("//div[@id='igLegend3']/div[4]/div[2]/button");
	By Apply = By.xpath("//div[@id='igLegend3']/div[4]/div[3]/button"); */
	
	@CacheLookup
	@FindBy(id="username")
	private WebElement Username;
	
	@CacheLookup
	@FindBy(id="password")
	private WebElement Password;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"idLoginButton\"]") 
	private WebElement Login;
	
	@FindBy(xpath="//div[@id='igLegend3']/div[4]/div[1]/button")
	WebElement RestoreAll;
	
	@FindBy(xpath="//div[@id='igLegend3']/div[4]/div[2]/button")
	WebElement ClearAll;
	
	@FindBy(xpath="//div[@id='igLegend3']/div[4]/div[3]/button")
	WebElement Apply;
	
	//Methods to be called in Test Cases
	
	
	/*public WebElement UserName()
	{
		return driver.findElement(Username);
	} */
	
	public void UserName()
	{
		Username.sendKeys("haiderm");
	}
	
	/*public WebElement Password()
	{
		return driver.findElement(Password);
	} */
	
	public void Password()
	{
		Password.sendKeys("haiderm");
	}

	/*public WebElement Login()
	{
		return driver.findElement(Login);
	} */
	
	public void Login()
	{
		Login.click();
	}
	
	/*public WebElement RestoreAll()
	{
		return driver.findElement(RestoreAll);
	} */
	
	public WebElement RestoreAll()
	{
		return RestoreAll;
	}
	
	/*public WebElement ClearAll()
	{
		return driver.findElement(ClearAll);
	} */
	
	public WebElement ClearAll()
	{
		return ClearAll;
	}
	
	/*public WebElement Apply()
	{
		return driver.findElement(Apply);
	} */
	
	public WebElement Apply()
	{
		return Apply;
	}
	
	
    // Page Object Factory	
	// Add Individual Client - Objects
	
	@FindBy(linkText="Change brand")
	WebElement iBrand;
	
	@FindBy(id="userBrandCombo")
	WebElement iBDropdown;
	
	@FindBy(id="changeUserBrandSave")
	WebElement iBSave;
	
	@FindBy(linkText="Search")
	WebElement iSearch;
	
	@FindBy(linkText="Policy client search")
	WebElement iPolicyClientSearch;

	@FindBy(id="SC_ClientSearch_FirstName")
	WebElement dummyFirstName;
	
	@FindBy(id="SC_ClientSearch_LastName")
	WebElement dummyLastName;
	
	@FindBy(id="SC_ClientSearch_PostCode")
	WebElement dummyPostCode;
	
	@FindBy(xpath="//*[@id='container']/div[3]/table/tbody/tr/td/div[1]/button")
	WebElement iSButton;
	
	@FindBy(id="btnAddIndividualClient")
	WebElement AiButton;
	
	@FindBy(id="ClientAdd_NameTitle_1a")
	WebElement iTitle;
	
	@FindBy(id="ClientAdd_FirstNm_1a")
	WebElement iFirstName;
	
	@FindBy(id="ClientAdd_LastNm_1a")
	WebElement iLastName;
	
	@FindBy(id="ClientAdd_OfficeEmail_1a")
	WebElement iEmail;
	
	@FindBy(id="SC_Search_Criteria")
	WebElement iPostCode;
	
	@FindBy(id="searchLocationIcon")
	WebElement QasButton;
	
	@FindBy(id="SC_Search_Results")
	WebElement QasResults;
	
	@FindBy(id="SC_ClientDetailsMaintain_DOB")
	WebElement iDOB;
	
	@FindBy(id="SC_ClientDetailsMaintain_Gender")
	WebElement iGender;
	
	@FindBy(id="SC_ClientDetailsMaintain_MaritalStatus")
	WebElement iMaritalStatus;
	
	@FindBy(id="SC_ClientDetailsMaintain_Occupation")
	WebElement iOccupation;
	
	@FindBy(id="SC_ClientDetailsMaintain_Occupation_Business_Type")
	WebElement iBusType;
	
	@FindBy(id="SC_ClientDetailsMaintain_Secondary_Occupation")
	WebElement iSecOccu;
	
	@FindBy(id="SC_ClientDetailsMaintain_Secondary_Occupation_Business_Type")
	WebElement iSecBusType;
	
	@FindBy(id="SC_ClientDetailsMaintain_Language")
	WebElement iLanguage;
	
	@FindBy(className="igFlowNext")
	WebElement iForward;
	
	@FindBy(id="igUserInteractResponseYes")
	WebElement PopupOnClientFrame;
	
	// Add Individual Client - Methods
	
	public WebElement iBrand()
	{
		return iBrand;
	}
		
	public WebElement iBDropdown()
	{
		return iBDropdown;
	}
	
	public WebElement iBSave()
	{
		return iBSave;
	}
	
	public WebElement iSearch()
	{
		return iSearch;
	}
	
	public WebElement iPolicyClientSearch()
	{
		return iPolicyClientSearch;
	}
	
	public WebElement dummyFirstName()
	{
		return dummyFirstName;
	}
	
	public WebElement dummyLastName()
	{
		return dummyLastName;
	}
	
	public WebElement dummyPostCode()
	{
		return dummyPostCode;
	}
	
	public WebElement iSButton()
	{
		return iSButton;
	}
	
	public WebElement AiButton()
	{
		return AiButton;
	}
	
	public WebElement iTitle()
	{
		return iTitle;
	}
	
	public WebElement iFirstName()
	{
		return iFirstName;
	}
	
	public WebElement iLastName()
	{
		return iLastName;
	}
	
	public WebElement iEmail()
	{
		return iEmail;
	}
	
	public WebElement iPostCode()
	{
		return iPostCode;
	}
	
	public WebElement QasButton()
	{
		return QasButton;
	}
	
	public WebElement QasResults()
	{
		return QasResults;
	}
	
	public WebElement iDOB()
	{
		return iDOB;
	}
	
	public WebElement iGender()
	{
		return iGender;
	}
	
	public WebElement iMaritalStatus()
	{
		return iMaritalStatus;
	}
	
	public WebElement iOccupation()
	{
		return iOccupation;
	}
	
	public WebElement iBusType()
	{
		return iBusType;
	}
	
	public WebElement iSecOccu()
	{
		return iSecOccu;
	}
	
	public WebElement iSecBusType()
	{
		return iSecBusType;
	}
	
	public WebElement iLanguage()
	{
		return iLanguage;
	}
	
	public WebElement iForward()
	{
		return iForward;
	}
	
	public WebElement PopupOnClientFrame()
	{
		return PopupOnClientFrame;
	}
	
	// Sign out - Objects
	
	@FindBy(linkText="(Sign out)") 
	WebElement iSignOut;
	
	// Sign out - Method
	
	public WebElement iSignOut()
	{
		return iSignOut;
	}
	
}


