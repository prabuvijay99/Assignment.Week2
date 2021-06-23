package week2.Assignments2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteTheLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id = 'username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class, 'Submit')]").click();
		driver.findElementByXPath("//a[contains(text(), 'SFA')]").click();
		
		driver.findElementByXPath("(//div[@class='x-panel-header'])[2]").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		driver.findElementByXPath("(//a[@class='x-tab-right'])[2]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
		String ID = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("The First Lead ID is :"+ID);
		
		
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(ID);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
		String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(text);
		if(text.contains("No records")) {
			System.out.println("Successful Deletion");
		}else {
			System.out.println("Deletion Failed");
		}
		
		driver.close();
		}
		
		
	}


