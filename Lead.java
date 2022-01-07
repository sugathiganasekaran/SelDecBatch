package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
       String title = driver.getTitle();
       System.out.println(title);
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sugathi");
        WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select dropdown=new Select(dd);
        int size=dropdown.getOptions().size();
        dropdown.selectByIndex(size-5);
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("suga");
        driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("testLeaf");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("software testing");
        driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000000");
        WebElement down = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select dropdown1=new Select(down);
       dropdown1.selectByVisibleText("Computer Software");
       WebElement dpd2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select dropdown2=new Select(dpd2);
         dropdown2.selectByVisibleText("Partnership");
         driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("625528");
         driver.findElement(By.id("createLeadForm_description")).sendKeys("testleaf s best");
         driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("testLeaf s best");
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rama");
         WebElement dpd3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
         Select dropdown3=new Select(dpd3);
         dropdown3.selectByVisibleText("Automobile");
         driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("subu");
         driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/28/1993");
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("suga");        
         WebElement dpd4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
         Select dropdown4=new Select(dpd4);
         dropdown4.selectByVisibleText("USD - American Dollar");
         driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("3000");
         driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("smpgh");
         
         driver.findElement(By.id("createLeadForm__sp"));
         
         driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+164");         
         driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+22");
         driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("6788");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Suga@gmail.com");
         
         driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+16467889544");
         driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Dhanvi");
         driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
         driver.findElement(By.id("createLeadForm__sp"));
         driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sugathi");
         driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("krishnanKovil");
         driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Theni");
         driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("625513");
         driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("625");
         driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("hattem");
         driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("625513");
         driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("SowddamammanKovil");
         WebElement dpd5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
         Select dropdown5=new Select(dpd5);
         dropdown5.selectByVisibleText("Texas");
         WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
         Select dropdown6=new Select(country);
         dropdown6.selectByVisibleText("United States");
         driver.findElement(By.name("submitButton")).click();
       driver.close();
         
         
         
         
         
}}
