package week2.Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreationOfEmployee {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		if(title.contains("Leaftaps")) 
				System.out.println("Login Successful");
		else {
				System.out.println("Login Failure");
		}
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Prabhakaran");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Chandran");
		
		WebElement findElementById = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(findElementById);
		dropdown.selectByIndex(5);
		
		WebElement findElementById2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown2 = new Select(findElementById2);
		dropdown2.selectByVisibleText("Catalog Generating Marketing Campaigns");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Prabha");
		
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("C");
		
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr.");
		
		driver.findElementById("createLeadForm_birthDate").sendKeys("06/11/1991");
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Testing Engineer");
		
		driver.findElementById("createLeadForm_departmentName").sendKeys("Software Testing");
		
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("10,00,000");
		
		WebElement findElementById3 = driver.findElementById("createLeadForm_currencyUomId");
		Select dropdown3 = new Select(findElementById3);
		dropdown3.selectByValue("INR");
		
		WebElement findElementById4 = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown4 = new Select(findElementById4);
		dropdown4.selectByValue("IND_SOFTWARE");
				
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("48");
		
		WebElement findElementById5 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown5 = new Select(findElementById5);
		dropdown5.selectByIndex(1);
		
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8072514199");
		
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("prabuvijay99@gmail.com");
		
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("createLeadForm_generalToName").sendKeys("Prabhakaran.c");
		
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("DhanaLakshmi");
		
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("PeriyaNachi Amman Kovil");
		
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Street Kottaiyur");
		
		driver.findElementById("createLeadForm_generalCity").sendKeys("Karaikudi");
		
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("Tamil Nadu");

		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("630 106");
		
		WebElement findElementById6 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown6 = new Select(findElementById6);
		dropdown6.selectByVisibleText("India");
		
		driver.findElementByClassName("smallSubmit").click();
		
		driver.findElementByLinkText("Duplicate Lead").click();
		
		driver.findElementById("createLeadForm_companyName").clear();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
		
			
		driver.findElementByClassName("smallSubmit").click();
		
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(text);
		if(text.contains("Amazon")) 
			System.out.println("SuccessFully Updated");
		else {
			System.out.println("Failed to Update");
		}
				
		driver.close();
				
		
		}
		
		

	}


