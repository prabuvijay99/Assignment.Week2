package week2.Assignments2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadGopi {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Gopi");
					
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		String title = driver.getTitle();
		
		
		String text = driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']").getText();
		System.out.println(text);
		String prevCompany = driver.findElementByXPath("(//span[@class='tabletext'])[3]").getText();
		System.out.println(prevCompany);
		
		driver.findElementByXPath("//a[@class='subMenuButton'][3]").click();
		
	
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementByClassName("smallSubmit").click();
		
		if(prevCompany.contains(driver.findElementById("viewLead_companyName_sp").getText())) {
			System.out.println("Update failed");
		} else {
			System.out.println("Updated Success");
		}
		driver.close();
		
}
		
		
	}


