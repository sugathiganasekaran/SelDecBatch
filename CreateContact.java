package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
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
        
        driver.findElement(By.id("createLeadForm_description")).sendKeys("testleaf s best");
        
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rama");
        
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ra");
        
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Suga@gmail.com");
        
        
        WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
        Select dropdown6=new Select(country);
        dropdown6.selectByVisibleText("Norway");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.xpath("//textarea[@name='description']")).clear();
        driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("importantNote");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        
        System.out.println("The title is :" +driver.getTitle());
        driver.close();
        
        
        
	}

}
