package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String tittle = driver.findElement(By.tagName("h2")).getText();
		System.out.println(tittle);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/06/2000");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source1 = new Select(source);
		source1.selectByVisibleText("Employee");
		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry = new Select(Industry);
		industry.selectByIndex(2);
		WebElement ownerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership = new Select(ownerShip);
		ownership.selectByValue("OWN_CCORP");
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select markCamp = new Select(marketingCampaign);
		markCamp.selectByVisibleText("Automobile");
		WebElement counTry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(counTry);
		country.selectByValue("IND");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state1 = new Select(state);
		state1.selectByVisibleText("TAMILNADU");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shreyas");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shrey");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("70,000.00");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome all");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Read all the instructions below");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Harathi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Harath");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Assurance");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10,000");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("NASQAQ");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("(0)44");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("44");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shreyas07@yahoo.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7459455082");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Shreyas");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No. 15, Lakshmi street, Yashmi Nagar");
		driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Gokulnath");
		driver.findElement(By.name("primaryWebUrl")).sendKeys("https://en-gb.facebook.com/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Madhu");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No. 15, Yamshmi street, Rajen Nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Delhi");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("050");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("3800");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Shan Tae");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("No.32, Ganga street, Umaesh Nagar,");
		
		
	}

}
