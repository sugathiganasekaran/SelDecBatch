package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email {

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
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Find Contacts")).click();
        driver.findElement(By.linkText("Email")).click();
        
        driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
        driver.findElement(By.id("ext-gen212")).click();
       driver.close();
        
       
	}}

