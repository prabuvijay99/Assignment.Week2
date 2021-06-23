package week2.Assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@id='src']/following::li").click();
		
		
		driver.findElementById("dest").sendKeys("Trichy");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@id='dest']/following::li").click();
		Thread.sleep(1000);
		
		driver.findElementById("onward_cal").click();
		driver.findElementByXPath("(//td[@class='wd day'])[4]").click();
		Thread.sleep(1000);
		
		
		driver.findElementById("search_btn").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//i[@class='icon icon-close c-fs']").click();
		
		String Route = driver.findElementByXPath("(//div[@class='onward d-block fl'])").getText();
		System.out.println("Bus Route and Time : "+Route);
		
		String buses = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("Buses Available:"+buses);
		Thread.sleep(1000);
		
		driver.findElementByXPath("(//label[@class='custom-checkbox'])[5]").click();
		String buses1 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("Seater Buses Available:"+buses1);
		Thread.sleep(1000);
		driver.findElementByXPath("(//label[@class='custom-checkbox'])[5]").click();
		
		driver.findElementByXPath("(//label[@class='custom-checkbox'])[6]").click();
		String buses2 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("Sleeper Buses Available:"+buses2);
		Thread.sleep(1000);
		driver.findElementByXPath("(//label[@class='custom-checkbox'])[6]").click();
		
		driver.findElementByXPath("(//label[@class='cbox-label'])[7]").click();
		String buses3 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("AC Buses Available:"+buses3);
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
	}

}
